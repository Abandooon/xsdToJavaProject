package stdgui.data.model.modelwrapper;


    
    


     

public class TargetOperationRefWrapper {

    
    
    private TargetOperationRef targetOperationRef;

    public TargetOperationRefWrapper(TargetOperationRef targetOperationRef) {
        this.targetOperationRef = targetOperationRef;
    }

   
    public ClientServerOperationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetOperationRef.getDest())) {
            
            return targetOperationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetOperationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetOperationRef.getValue();
        java.lang.String type = targetOperationRef.getDest().toString().replace("_", "-");
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

    
    public ClientServerOperationWrapper getClientServerOperation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetOperationRef.getValue();
        java.lang.String type = targetOperationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerOperation){
            return new ClientServerOperationWrapper((ClientServerOperation) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}