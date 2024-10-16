package stdgui.data.model.modelwrapper;


    
    


     

public class ClearDiagnosticInformationClassRefWrapper {

    
    
    private ClearDiagnosticInformationClassRef clearDiagnosticInformationClassRef;

    public ClearDiagnosticInformationClassRefWrapper(ClearDiagnosticInformationClassRef clearDiagnosticInformationClassRef) {
        this.clearDiagnosticInformationClassRef = clearDiagnosticInformationClassRef;
    }

   
    public DiagnosticClearDiagnosticInformationClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(clearDiagnosticInformationClassRef.getDest())) {
            
            return clearDiagnosticInformationClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getClearDiagnosticInformationClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = clearDiagnosticInformationClassRef.getValue();
        java.lang.String type = clearDiagnosticInformationClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticClearDiagnosticInformationClassWrapper getDiagnosticClearDiagnosticInformationClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = clearDiagnosticInformationClassRef.getValue();
        java.lang.String type = clearDiagnosticInformationClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticClearDiagnosticInformationClass){
            return new DiagnosticClearDiagnosticInformationClassWrapper((DiagnosticClearDiagnosticInformationClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}