package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticExtendedDataRecordRefWrapper {

    
    
    private DiagnosticExtendedDataRecordRef diagnosticExtendedDataRecordRef;

    public DiagnosticExtendedDataRecordRefWrapper(DiagnosticExtendedDataRecordRef diagnosticExtendedDataRecordRef) {
        this.diagnosticExtendedDataRecordRef = diagnosticExtendedDataRecordRef;
    }

   
    public DiagnosticExtendedDataRecordSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecordRef.getDest())) {
            
            return diagnosticExtendedDataRecordRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticExtendedDataRecordRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticExtendedDataRecordRef.getValue();
        java.lang.String type = diagnosticExtendedDataRecordRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticExtendedDataRecordWrapper getDiagnosticExtendedDataRecord() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticExtendedDataRecordRef.getValue();
        java.lang.String type = diagnosticExtendedDataRecordRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticExtendedDataRecord){
            return new DiagnosticExtendedDataRecordWrapper((DiagnosticExtendedDataRecord) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}