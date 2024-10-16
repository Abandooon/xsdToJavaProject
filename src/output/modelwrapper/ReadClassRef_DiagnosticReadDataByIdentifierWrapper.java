package stdgui.data.model.modelwrapper;


    
    


     

public class ReadClassRef_DiagnosticReadDataByIdentifierWrapper {

    
    
    private ReadClassRef_DiagnosticReadDataByIdentifier readClassRef_DiagnosticReadDataByIdentifier;

    public ReadClassRef_DiagnosticReadDataByIdentifierWrapper(ReadClassRef_DiagnosticReadDataByIdentifier readClassRef_DiagnosticReadDataByIdentifier) {
        this.readClassRef_DiagnosticReadDataByIdentifier = readClassRef_DiagnosticReadDataByIdentifier;
    }

   
    public DiagnosticReadDataByIdentifierClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(readClassRef_DiagnosticReadDataByIdentifier.getDest())) {
            
            return readClassRef_DiagnosticReadDataByIdentifier.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReadClassRef_DiagnosticReadDataByIdentifierObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = readClassRef_DiagnosticReadDataByIdentifier.getValue();
        java.lang.String type = readClassRef_DiagnosticReadDataByIdentifier.getDest().toString().replace("_", "-");
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

    
    public DiagnosticReadDataByIdentifierClassWrapper getDiagnosticReadDataByIdentifierClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = readClassRef_DiagnosticReadDataByIdentifier.getValue();
        java.lang.String type = readClassRef_DiagnosticReadDataByIdentifier.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDataByIdentifierClass){
            return new DiagnosticReadDataByIdentifierClassWrapper((DiagnosticReadDataByIdentifierClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}