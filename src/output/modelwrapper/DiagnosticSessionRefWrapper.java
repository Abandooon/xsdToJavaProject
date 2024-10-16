package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticSessionRefWrapper {

    
    
    private DiagnosticSessionRef diagnosticSessionRef;

    public DiagnosticSessionRefWrapper(DiagnosticSessionRef diagnosticSessionRef) {
        this.diagnosticSessionRef = diagnosticSessionRef;
    }

   
    public DiagnosticSessionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionRef.getDest())) {
            
            return diagnosticSessionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticSessionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticSessionRef.getValue();
        java.lang.String type = diagnosticSessionRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticSessionWrapper getDiagnosticSession() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticSessionRef.getValue();
        java.lang.String type = diagnosticSessionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSession){
            return new DiagnosticSessionWrapper((DiagnosticSession) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}