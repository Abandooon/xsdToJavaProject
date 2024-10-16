package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticConnectionRefWrapper {

    
    
    private DiagnosticConnectionRef diagnosticConnectionRef;

    public DiagnosticConnectionRefWrapper(DiagnosticConnectionRef diagnosticConnectionRef) {
        this.diagnosticConnectionRef = diagnosticConnectionRef;
    }

   
    public DiagnosticConnectionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectionRef.getDest())) {
            
            return diagnosticConnectionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticConnectionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticConnectionRef.getValue();
        java.lang.String type = diagnosticConnectionRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticConnectionWrapper getDiagnosticConnection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticConnectionRef.getValue();
        java.lang.String type = diagnosticConnectionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticConnection){
            return new DiagnosticConnectionWrapper((DiagnosticConnection) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}