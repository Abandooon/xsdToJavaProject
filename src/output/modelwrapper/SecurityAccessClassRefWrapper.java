package stdgui.data.model.modelwrapper;


    
    


     

public class SecurityAccessClassRefWrapper {

    
    
    private SecurityAccessClassRef securityAccessClassRef;

    public SecurityAccessClassRefWrapper(SecurityAccessClassRef securityAccessClassRef) {
        this.securityAccessClassRef = securityAccessClassRef;
    }

   
    public DiagnosticSecurityAccessClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(securityAccessClassRef.getDest())) {
            
            return securityAccessClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSecurityAccessClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = securityAccessClassRef.getValue();
        java.lang.String type = securityAccessClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticSecurityAccessClassWrapper getDiagnosticSecurityAccessClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = securityAccessClassRef.getValue();
        java.lang.String type = securityAccessClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSecurityAccessClass){
            return new DiagnosticSecurityAccessClassWrapper((DiagnosticSecurityAccessClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}