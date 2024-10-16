package stdgui.data.model.modelwrapper;


    
    


     

public class FirstOperationRefWrapper {

    
    
    private FirstOperationRef firstOperationRef;

    public FirstOperationRefWrapper(FirstOperationRef firstOperationRef) {
        this.firstOperationRef = firstOperationRef;
    }

   
    public ClientServerOperationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(firstOperationRef.getDest())) {
            
            return firstOperationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFirstOperationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = firstOperationRef.getValue();
        java.lang.String type = firstOperationRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = firstOperationRef.getValue();
        java.lang.String type = firstOperationRef.getDest().toString().replace("_", "-");
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