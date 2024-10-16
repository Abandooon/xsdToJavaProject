package stdgui.data.model.modelwrapper;


    
    


     

public class TargetRunnableEntityRefWrapper {

    
    
    private TargetRunnableEntityRef targetRunnableEntityRef;

    public TargetRunnableEntityRefWrapper(TargetRunnableEntityRef targetRunnableEntityRef) {
        this.targetRunnableEntityRef = targetRunnableEntityRef;
    }

   
    public RunnableEntitySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetRunnableEntityRef.getDest())) {
            
            return targetRunnableEntityRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetRunnableEntityRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetRunnableEntityRef.getValue();
        java.lang.String type = targetRunnableEntityRef.getDest().toString().replace("_", "-");
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

    
    public RunnableEntityWrapper getRunnableEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRunnableEntityRef.getValue();
        java.lang.String type = targetRunnableEntityRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RunnableEntity){
            return new RunnableEntityWrapper((RunnableEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}