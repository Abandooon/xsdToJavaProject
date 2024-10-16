package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticEnableConditionRefWrapper {

    
    
    private DiagnosticEnableConditionRef diagnosticEnableConditionRef;

    public DiagnosticEnableConditionRefWrapper(DiagnosticEnableConditionRef diagnosticEnableConditionRef) {
        this.diagnosticEnableConditionRef = diagnosticEnableConditionRef;
    }

   
    public DiagnosticEnableConditionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionRef.getDest())) {
            
            return diagnosticEnableConditionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticEnableConditionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticEnableConditionRef.getValue();
        java.lang.String type = diagnosticEnableConditionRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticEnableConditionWrapper getDiagnosticEnableCondition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticEnableConditionRef.getValue();
        java.lang.String type = diagnosticEnableConditionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEnableCondition){
            return new DiagnosticEnableConditionWrapper((DiagnosticEnableCondition) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}