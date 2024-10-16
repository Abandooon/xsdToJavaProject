package stdgui.data.model.modelwrapper;


    
    


     

public class AclRoleRefWrapper {

    
    
    private AclRoleRef aclRoleRef;

    public AclRoleRefWrapper(AclRoleRef aclRoleRef) {
        this.aclRoleRef = aclRoleRef;
    }

   
    public AclRoleSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(aclRoleRef.getDest())) {
            
            return aclRoleRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAclRoleRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = aclRoleRef.getValue();
        java.lang.String type = aclRoleRef.getDest().toString().replace("_", "-");
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

    
    public AclRoleWrapper getAclRole() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = aclRoleRef.getValue();
        java.lang.String type = aclRoleRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AclRole){
            return new AclRoleWrapper((AclRole) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}