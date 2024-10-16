package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class ServiceInstanceRef_DiagnosticServiceTableWrapper {

    
    
    private ServiceInstanceRef_DiagnosticServiceTable serviceInstanceRef_DiagnosticServiceTable;

    public ServiceInstanceRef_DiagnosticServiceTableWrapper(ServiceInstanceRef_DiagnosticServiceTable serviceInstanceRef_DiagnosticServiceTable) {
        this.serviceInstanceRef_DiagnosticServiceTable = serviceInstanceRef_DiagnosticServiceTable;
    }

   
    public DiagnosticServiceInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(serviceInstanceRef_DiagnosticServiceTable.getDest())) {
            
            return serviceInstanceRef_DiagnosticServiceTable.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getServiceInstanceRef_DiagnosticServiceTableObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
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

    
    public DiagnosticClearDiagnosticInformationWrapper getDiagnosticClearDiagnosticInformation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticClearDiagnosticInformation){
            return new DiagnosticClearDiagnosticInformationWrapper((DiagnosticClearDiagnosticInformation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticComControlWrapper getDiagnosticComControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticComControl){
            return new DiagnosticComControlWrapper((DiagnosticComControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticControlDtcSettingWrapper getDiagnosticControlDtcSetting() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticControlDtcSetting){
            return new DiagnosticControlDtcSettingWrapper((DiagnosticControlDtcSetting) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDataTransferWrapper getDiagnosticDataTransfer() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataTransfer){
            return new DiagnosticDataTransferWrapper((DiagnosticDataTransfer) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDynamicallyDefineDataIdentifierWrapper getDiagnosticDynamicallyDefineDataIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDynamicallyDefineDataIdentifier){
            return new DiagnosticDynamicallyDefineDataIdentifierWrapper((DiagnosticDynamicallyDefineDataIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEcuResetWrapper getDiagnosticEcuReset() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEcuReset){
            return new DiagnosticEcuResetWrapper((DiagnosticEcuReset) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticIoControlWrapper getDiagnosticIoControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticIoControl){
            return new DiagnosticIoControlWrapper((DiagnosticIoControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDtcInformationWrapper getDiagnosticReadDtcInformation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDtcInformation){
            return new DiagnosticReadDtcInformationWrapper((DiagnosticReadDtcInformation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDataByIdentifierWrapper getDiagnosticReadDataByIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDataByIdentifier){
            return new DiagnosticReadDataByIdentifierWrapper((DiagnosticReadDataByIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDataByPeriodicIdWrapper getDiagnosticReadDataByPeriodicId() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDataByPeriodicId){
            return new DiagnosticReadDataByPeriodicIdWrapper((DiagnosticReadDataByPeriodicId) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadMemoryByAddressWrapper getDiagnosticReadMemoryByAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadMemoryByAddress){
            return new DiagnosticReadMemoryByAddressWrapper((DiagnosticReadMemoryByAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestDownloadWrapper getDiagnosticRequestDownload() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestDownload){
            return new DiagnosticRequestDownloadWrapper((DiagnosticRequestDownload) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestFileTransferWrapper getDiagnosticRequestFileTransfer() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestFileTransfer){
            return new DiagnosticRequestFileTransferWrapper((DiagnosticRequestFileTransfer) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestUploadWrapper getDiagnosticRequestUpload() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestUpload){
            return new DiagnosticRequestUploadWrapper((DiagnosticRequestUpload) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticResponseOnEventWrapper getDiagnosticResponseOnEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticResponseOnEvent){
            return new DiagnosticResponseOnEventWrapper((DiagnosticResponseOnEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRoutineControlWrapper getDiagnosticRoutineControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRoutineControl){
            return new DiagnosticRoutineControlWrapper((DiagnosticRoutineControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSecurityAccessWrapper getDiagnosticSecurityAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSecurityAccess){
            return new DiagnosticSecurityAccessWrapper((DiagnosticSecurityAccess) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSessionControlWrapper getDiagnosticSessionControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSessionControl){
            return new DiagnosticSessionControlWrapper((DiagnosticSessionControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTransferExitWrapper getDiagnosticTransferExit() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTransferExit){
            return new DiagnosticTransferExitWrapper((DiagnosticTransferExit) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticWriteDataByIdentifierWrapper getDiagnosticWriteDataByIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteDataByIdentifier){
            return new DiagnosticWriteDataByIdentifierWrapper((DiagnosticWriteDataByIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticWriteMemoryByAddressWrapper getDiagnosticWriteMemoryByAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef_DiagnosticServiceTable.getValue();
        java.lang.String type = serviceInstanceRef_DiagnosticServiceTable.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteMemoryByAddress){
            return new DiagnosticWriteMemoryByAddressWrapper((DiagnosticWriteMemoryByAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}