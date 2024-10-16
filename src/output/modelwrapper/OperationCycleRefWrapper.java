package stdgui.data.model.modelwrapper;


    
    


     

public class OperationCycleRefWrapper {

    
    
    private OperationCycleRef operationCycleRef;

    public OperationCycleRefWrapper(OperationCycleRef operationCycleRef) {
        this.operationCycleRef = operationCycleRef;
    }

   
    public DiagnosticOperationCycleSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(operationCycleRef.getDest())) {
            
            return operationCycleRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getOperationCycleRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = operationCycleRef.getValue();
        java.lang.String type = operationCycleRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticOperationCycleWrapper getDiagnosticOperationCycle() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = operationCycleRef.getValue();
        java.lang.String type = operationCycleRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticOperationCycle){
            return new DiagnosticOperationCycleWrapper((DiagnosticOperationCycle) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}