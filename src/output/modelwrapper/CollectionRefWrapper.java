package stdgui.data.model.modelwrapper;


    
    


     
         import stdgui.data.model.orimodel.Collection;
     

public class CollectionRefWrapper {

    
    
    private CollectionRef collectionRef;

    public CollectionRefWrapper(CollectionRef collectionRef) {
        this.collectionRef = collectionRef;
    }

   
    public CollectionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(collectionRef.getDest())) {
            
            return collectionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCollectionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = collectionRef.getValue();
        java.lang.String type = collectionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        java.lang.String className = schemaController.convertClassName(type);
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        java.lang.String wrapperClassName = "" + className + "Wrapper";
        Class<?> wrapperClass = Class.forName(wrapperClassName);
        Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
        Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
        return wrapperInstance;
    }

    
    public CollectionWrapper getCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = collectionRef.getValue();
        java.lang.String type = collectionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Collection){
            return new CollectionWrapper((Collection) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}