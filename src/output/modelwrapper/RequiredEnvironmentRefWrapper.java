package stdgui.data.model.modelwrapper;


    
    


     

public class RequiredEnvironmentRefWrapper {

    
    
    private RequiredEnvironmentRef requiredEnvironmentRef;

    public RequiredEnvironmentRefWrapper(RequiredEnvironmentRef requiredEnvironmentRef) {
        this.requiredEnvironmentRef = requiredEnvironmentRef;
    }

   
    public BuildActionEnvironmentSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(requiredEnvironmentRef.getDest())) {
            
            return requiredEnvironmentRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRequiredEnvironmentRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = requiredEnvironmentRef.getValue();
        java.lang.String type = requiredEnvironmentRef.getDest().toString().replace("_", "-");
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

    
    public BuildActionEnvironmentWrapper getBuildActionEnvironment() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = requiredEnvironmentRef.getValue();
        java.lang.String type = requiredEnvironmentRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildActionEnvironment){
            return new BuildActionEnvironmentWrapper((BuildActionEnvironment) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}