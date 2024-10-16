package stdgui.data.model.modelwrapper;


    
    


     

public class SecurityLevelRefWrapper {

    
    
    private SecurityLevelRef securityLevelRef;

    public SecurityLevelRefWrapper(SecurityLevelRef securityLevelRef) {
        this.securityLevelRef = securityLevelRef;
    }

   
    public DiagnosticSecurityLevelSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(securityLevelRef.getDest())) {
            
            return securityLevelRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSecurityLevelRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = securityLevelRef.getValue();
        java.lang.String type = securityLevelRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticSecurityLevelWrapper getDiagnosticSecurityLevel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = securityLevelRef.getValue();
        java.lang.String type = securityLevelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSecurityLevel){
            return new DiagnosticSecurityLevelWrapper((DiagnosticSecurityLevel) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}