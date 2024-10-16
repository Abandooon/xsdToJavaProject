package stdgui.data.model.modelwrapper;


    
    


     

public class FlatMapRefWrapper {

    
    
    private FlatMapRef flatMapRef;

    public FlatMapRefWrapper(FlatMapRef flatMapRef) {
        this.flatMapRef = flatMapRef;
    }

   
    public FlatMapSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(flatMapRef.getDest())) {
            
            return flatMapRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFlatMapRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = flatMapRef.getValue();
        java.lang.String type = flatMapRef.getDest().toString().replace("_", "-");
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

    
    public FlatMapWrapper getFlatMap() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = flatMapRef.getValue();
        java.lang.String type = flatMapRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlatMap){
            return new FlatMapWrapper((FlatMap) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}