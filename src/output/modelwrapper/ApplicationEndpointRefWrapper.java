package stdgui.data.model.modelwrapper;


    
    


     

public class ApplicationEndpointRefWrapper {

    
    
    private ApplicationEndpointRef applicationEndpointRef;

    public ApplicationEndpointRefWrapper(ApplicationEndpointRef applicationEndpointRef) {
        this.applicationEndpointRef = applicationEndpointRef;
    }

   
    public ApplicationEndpointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(applicationEndpointRef.getDest())) {
            
            return applicationEndpointRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getApplicationEndpointRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = applicationEndpointRef.getValue();
        java.lang.String type = applicationEndpointRef.getDest().toString().replace("_", "-");
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

    
    public ApplicationEndpointWrapper getApplicationEndpoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = applicationEndpointRef.getValue();
        java.lang.String type = applicationEndpointRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationEndpoint){
            return new ApplicationEndpointWrapper((ApplicationEndpoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}