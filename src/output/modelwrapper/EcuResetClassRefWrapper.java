package stdgui.data.model.modelwrapper;


    
    


     

public class EcuResetClassRefWrapper {

    
    
    private EcuResetClassRef ecuResetClassRef;

    public EcuResetClassRefWrapper(EcuResetClassRef ecuResetClassRef) {
        this.ecuResetClassRef = ecuResetClassRef;
    }

   
    public DiagnosticEcuResetClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ecuResetClassRef.getDest())) {
            
            return ecuResetClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEcuResetClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ecuResetClassRef.getValue();
        java.lang.String type = ecuResetClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticEcuResetClassWrapper getDiagnosticEcuResetClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecuResetClassRef.getValue();
        java.lang.String type = ecuResetClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEcuResetClass){
            return new DiagnosticEcuResetClassWrapper((DiagnosticEcuResetClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}