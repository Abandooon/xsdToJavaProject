package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticDataElementRefWrapper {

    
    
    private DiagnosticDataElementRef diagnosticDataElementRef;

    public DiagnosticDataElementRefWrapper(DiagnosticDataElementRef diagnosticDataElementRef) {
        this.diagnosticDataElementRef = diagnosticDataElementRef;
    }

   
    public DiagnosticDataElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElementRef.getDest())) {
            
            return diagnosticDataElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticDataElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticDataElementRef.getValue();
        java.lang.String type = diagnosticDataElementRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticDataElementWrapper getDiagnosticDataElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticDataElementRef.getValue();
        java.lang.String type = diagnosticDataElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataElement){
            return new DiagnosticDataElementWrapper((DiagnosticDataElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}