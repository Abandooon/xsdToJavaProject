package stdgui.data.model.modelwrapper;


    
    


     

public class ReadDtcInformationClassRefWrapper {

    
    
    private ReadDtcInformationClassRef readDtcInformationClassRef;

    public ReadDtcInformationClassRefWrapper(ReadDtcInformationClassRef readDtcInformationClassRef) {
        this.readDtcInformationClassRef = readDtcInformationClassRef;
    }

   
    public DiagnosticReadDtcInformationClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(readDtcInformationClassRef.getDest())) {
            
            return readDtcInformationClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReadDtcInformationClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = readDtcInformationClassRef.getValue();
        java.lang.String type = readDtcInformationClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticReadDtcInformationClassWrapper getDiagnosticReadDtcInformationClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = readDtcInformationClassRef.getValue();
        java.lang.String type = readDtcInformationClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDtcInformationClass){
            return new DiagnosticReadDtcInformationClassWrapper((DiagnosticReadDtcInformationClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}