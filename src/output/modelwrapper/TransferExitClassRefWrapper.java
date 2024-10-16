package stdgui.data.model.modelwrapper;


    
    


     

public class TransferExitClassRefWrapper {

    
    
    private TransferExitClassRef transferExitClassRef;

    public TransferExitClassRefWrapper(TransferExitClassRef transferExitClassRef) {
        this.transferExitClassRef = transferExitClassRef;
    }

   
    public DiagnosticTransferExitClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(transferExitClassRef.getDest())) {
            
            return transferExitClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTransferExitClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = transferExitClassRef.getValue();
        java.lang.String type = transferExitClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticTransferExitClassWrapper getDiagnosticTransferExitClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = transferExitClassRef.getValue();
        java.lang.String type = transferExitClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTransferExitClass){
            return new DiagnosticTransferExitClassWrapper((DiagnosticTransferExitClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}