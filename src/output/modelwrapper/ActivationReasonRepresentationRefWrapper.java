package stdgui.data.model.modelwrapper;


    
    


     

public class ActivationReasonRepresentationRefWrapper {

    
    
    private ActivationReasonRepresentationRef activationReasonRepresentationRef;

    public ActivationReasonRepresentationRefWrapper(ActivationReasonRepresentationRef activationReasonRepresentationRef) {
        this.activationReasonRepresentationRef = activationReasonRepresentationRef;
    }

   
    public ExecutableEntityActivationReasonSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(activationReasonRepresentationRef.getDest())) {
            
            return activationReasonRepresentationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getActivationReasonRepresentationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = activationReasonRepresentationRef.getValue();
        java.lang.String type = activationReasonRepresentationRef.getDest().toString().replace("_", "-");
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

    
    public ExecutableEntityActivationReasonWrapper getExecutableEntityActivationReason() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = activationReasonRepresentationRef.getValue();
        java.lang.String type = activationReasonRepresentationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExecutableEntityActivationReason){
            return new ExecutableEntityActivationReasonWrapper((ExecutableEntityActivationReason) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}