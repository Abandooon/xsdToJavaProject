package stdgui.data.model.modelwrapper;


    
    


     

public class DataTransferClassRefWrapper {

    
    
    private DataTransferClassRef dataTransferClassRef;

    public DataTransferClassRefWrapper(DataTransferClassRef dataTransferClassRef) {
        this.dataTransferClassRef = dataTransferClassRef;
    }

   
    public DiagnosticDataTransferClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dataTransferClassRef.getDest())) {
            
            return dataTransferClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDataTransferClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dataTransferClassRef.getValue();
        java.lang.String type = dataTransferClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticDataTransferClassWrapper getDiagnosticDataTransferClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dataTransferClassRef.getValue();
        java.lang.String type = dataTransferClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataTransferClass){
            return new DiagnosticDataTransferClassWrapper((DiagnosticDataTransferClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}