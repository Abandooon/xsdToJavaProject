package stdgui.data.model.modelwrapper;


    
    


     

public class BswBehaviorRefWrapper {

    
    
    private BswBehaviorRef bswBehaviorRef;

    public BswBehaviorRefWrapper(BswBehaviorRef bswBehaviorRef) {
        this.bswBehaviorRef = bswBehaviorRef;
    }

   
    public BswInternalBehaviorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(bswBehaviorRef.getDest())) {
            
            return bswBehaviorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBswBehaviorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = bswBehaviorRef.getValue();
        java.lang.String type = bswBehaviorRef.getDest().toString().replace("_", "-");
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

    
    public BswInternalBehaviorWrapper getBswInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = bswBehaviorRef.getValue();
        java.lang.String type = bswBehaviorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalBehavior){
            return new BswInternalBehaviorWrapper((BswInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}