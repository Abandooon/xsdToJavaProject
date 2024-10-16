package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticStorageConditionRefWrapper {

    
    
    private DiagnosticStorageConditionRef diagnosticStorageConditionRef;

    public DiagnosticStorageConditionRefWrapper(DiagnosticStorageConditionRef diagnosticStorageConditionRef) {
        this.diagnosticStorageConditionRef = diagnosticStorageConditionRef;
    }

   
    public DiagnosticStorageConditionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionRef.getDest())) {
            
            return diagnosticStorageConditionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticStorageConditionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticStorageConditionRef.getValue();
        java.lang.String type = diagnosticStorageConditionRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticStorageConditionWrapper getDiagnosticStorageCondition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticStorageConditionRef.getValue();
        java.lang.String type = diagnosticStorageConditionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStorageCondition){
            return new DiagnosticStorageConditionWrapper((DiagnosticStorageCondition) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}