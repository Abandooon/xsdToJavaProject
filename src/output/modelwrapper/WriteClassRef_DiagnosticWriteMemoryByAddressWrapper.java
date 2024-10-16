package stdgui.data.model.modelwrapper;


    
    


     

public class WriteClassRef_DiagnosticWriteMemoryByAddressWrapper {

    
    
    private WriteClassRef_DiagnosticWriteMemoryByAddress writeClassRef_DiagnosticWriteMemoryByAddress;

    public WriteClassRef_DiagnosticWriteMemoryByAddressWrapper(WriteClassRef_DiagnosticWriteMemoryByAddress writeClassRef_DiagnosticWriteMemoryByAddress) {
        this.writeClassRef_DiagnosticWriteMemoryByAddress = writeClassRef_DiagnosticWriteMemoryByAddress;
    }

   
    public DiagnosticWriteMemoryByAddressClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(writeClassRef_DiagnosticWriteMemoryByAddress.getDest())) {
            
            return writeClassRef_DiagnosticWriteMemoryByAddress.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getWriteClassRef_DiagnosticWriteMemoryByAddressObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = writeClassRef_DiagnosticWriteMemoryByAddress.getValue();
        java.lang.String type = writeClassRef_DiagnosticWriteMemoryByAddress.getDest().toString().replace("_", "-");
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

    
    public DiagnosticWriteMemoryByAddressClassWrapper getDiagnosticWriteMemoryByAddressClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = writeClassRef_DiagnosticWriteMemoryByAddress.getValue();
        java.lang.String type = writeClassRef_DiagnosticWriteMemoryByAddress.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteMemoryByAddressClass){
            return new DiagnosticWriteMemoryByAddressClassWrapper((DiagnosticWriteMemoryByAddressClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}