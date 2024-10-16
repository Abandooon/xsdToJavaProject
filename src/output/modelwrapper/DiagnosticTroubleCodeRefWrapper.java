package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class DiagnosticTroubleCodeRefWrapper {

    
    
    private DiagnosticTroubleCodeRef diagnosticTroubleCodeRef;

    public DiagnosticTroubleCodeRefWrapper(DiagnosticTroubleCodeRef diagnosticTroubleCodeRef) {
        this.diagnosticTroubleCodeRef = diagnosticTroubleCodeRef;
    }

   
    public DiagnosticTroubleCodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeRef.getDest())) {
            
            return diagnosticTroubleCodeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticTroubleCodeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticTroubleCodeRef.getValue();
        java.lang.String type = diagnosticTroubleCodeRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticTroubleCodeJ1939Wrapper getDiagnosticTroubleCodeJ1939() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticTroubleCodeRef.getValue();
        java.lang.String type = diagnosticTroubleCodeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeJ1939){
            return new DiagnosticTroubleCodeJ1939Wrapper((DiagnosticTroubleCodeJ1939) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTroubleCodeObdWrapper getDiagnosticTroubleCodeObd() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticTroubleCodeRef.getValue();
        java.lang.String type = diagnosticTroubleCodeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeObd){
            return new DiagnosticTroubleCodeObdWrapper((DiagnosticTroubleCodeObd) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTroubleCodeUdsWrapper getDiagnosticTroubleCodeUds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticTroubleCodeRef.getValue();
        java.lang.String type = diagnosticTroubleCodeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeUds){
            return new DiagnosticTroubleCodeUdsWrapper((DiagnosticTroubleCodeUds) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}