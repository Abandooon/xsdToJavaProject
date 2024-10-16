package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticEventRefWrapper {

    
    
    private DiagnosticEventRef diagnosticEventRef;

    public DiagnosticEventRefWrapper(DiagnosticEventRef diagnosticEventRef) {
        this.diagnosticEventRef = diagnosticEventRef;
    }

   
    public DiagnosticEventSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticEventRef.getDest())) {
            
            return diagnosticEventRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticEventRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticEventRef.getValue();
        java.lang.String type = diagnosticEventRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticEventWrapper getDiagnosticEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticEventRef.getValue();
        java.lang.String type = diagnosticEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEvent){
            return new DiagnosticEventWrapper((DiagnosticEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}