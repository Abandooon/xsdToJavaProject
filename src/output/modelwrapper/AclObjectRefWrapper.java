package stdgui.data.model.modelwrapper;


    
    


     

public class AclObjectRefWrapper {

    
    
    private AclObjectRef aclObjectRef;

    public AclObjectRefWrapper(AclObjectRef aclObjectRef) {
        this.aclObjectRef = aclObjectRef;
    }

   
    public AclObjectSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(aclObjectRef.getDest())) {
            
            return aclObjectRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAclObjectRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = aclObjectRef.getValue();
        java.lang.String type = aclObjectRef.getDest().toString().replace("_", "-");
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

    
    public AclObjectSetWrapper getAclObjectSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = aclObjectRef.getValue();
        java.lang.String type = aclObjectRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AclObjectSet){
            return new AclObjectSetWrapper((AclObjectSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}