package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticServiceTableRefWrapper {

    
    
    private DiagnosticServiceTableRef diagnosticServiceTableRef;

    public DiagnosticServiceTableRefWrapper(DiagnosticServiceTableRef diagnosticServiceTableRef) {
        this.diagnosticServiceTableRef = diagnosticServiceTableRef;
    }

   
    public DiagnosticServiceTableSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTableRef.getDest())) {
            
            return diagnosticServiceTableRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticServiceTableRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticServiceTableRef.getValue();
        java.lang.String type = diagnosticServiceTableRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticServiceTableWrapper getDiagnosticServiceTable() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticServiceTableRef.getValue();
        java.lang.String type = diagnosticServiceTableRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticServiceTable){
            return new DiagnosticServiceTableWrapper((DiagnosticServiceTable) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}