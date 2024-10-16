package stdgui.data.model.modelwrapper;


    
    


     

public class AccessPermissionRefWrapper {

    
    
    private AccessPermissionRef accessPermissionRef;

    public AccessPermissionRefWrapper(AccessPermissionRef accessPermissionRef) {
        this.accessPermissionRef = accessPermissionRef;
    }

   
    public DiagnosticAccessPermissionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(accessPermissionRef.getDest())) {
            
            return accessPermissionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAccessPermissionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = accessPermissionRef.getValue();
        java.lang.String type = accessPermissionRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticAccessPermissionWrapper getDiagnosticAccessPermission() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = accessPermissionRef.getValue();
        java.lang.String type = accessPermissionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticAccessPermission){
            return new DiagnosticAccessPermissionWrapper((DiagnosticAccessPermission) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}