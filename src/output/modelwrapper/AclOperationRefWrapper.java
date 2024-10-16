package stdgui.data.model.modelwrapper;


    
    


     

public class AclOperationRefWrapper {

    
    
    private AclOperationRef aclOperationRef;

    public AclOperationRefWrapper(AclOperationRef aclOperationRef) {
        this.aclOperationRef = aclOperationRef;
    }

   
    public AclOperationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(aclOperationRef.getDest())) {
            
            return aclOperationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAclOperationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = aclOperationRef.getValue();
        java.lang.String type = aclOperationRef.getDest().toString().replace("_", "-");
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

    
    public AclOperationWrapper getAclOperation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = aclOperationRef.getValue();
        java.lang.String type = aclOperationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AclOperation){
            return new AclOperationWrapper((AclOperation) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}