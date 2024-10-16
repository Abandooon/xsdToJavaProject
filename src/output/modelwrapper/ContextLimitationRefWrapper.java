package stdgui.data.model.modelwrapper;


    
    


     

public class ContextLimitationRefWrapper {

    
    
    private ContextLimitationRef contextLimitationRef;

    public ContextLimitationRefWrapper(ContextLimitationRef contextLimitationRef) {
        this.contextLimitationRef = contextLimitationRef;
    }

   
    public BswDistinguishedPartitionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(contextLimitationRef.getDest())) {
            
            return contextLimitationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContextLimitationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = contextLimitationRef.getValue();
        java.lang.String type = contextLimitationRef.getDest().toString().replace("_", "-");
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

    
    public BswDistinguishedPartitionWrapper getBswDistinguishedPartition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = contextLimitationRef.getValue();
        java.lang.String type = contextLimitationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswDistinguishedPartition){
            return new BswDistinguishedPartitionWrapper((BswDistinguishedPartition) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}