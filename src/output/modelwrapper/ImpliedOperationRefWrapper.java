package stdgui.data.model.modelwrapper;


    
    


     

public class ImpliedOperationRefWrapper {

    
    
    private ImpliedOperationRef impliedOperationRef;

    public ImpliedOperationRefWrapper(ImpliedOperationRef impliedOperationRef) {
        this.impliedOperationRef = impliedOperationRef;
    }

   
    public AclOperationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(impliedOperationRef.getDest())) {
            
            return impliedOperationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getImpliedOperationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = impliedOperationRef.getValue();
        java.lang.String type = impliedOperationRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = impliedOperationRef.getValue();
        java.lang.String type = impliedOperationRef.getDest().toString().replace("_", "-");
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