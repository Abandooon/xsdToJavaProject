package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class CallbackHeaderRefWrapper {

    
    
    private CallbackHeaderRef callbackHeaderRef;

    public CallbackHeaderRefWrapper(CallbackHeaderRef callbackHeaderRef) {
        this.callbackHeaderRef = callbackHeaderRef;
    }

   
    public ServiceNeedsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(callbackHeaderRef.getDest())) {
            
            return callbackHeaderRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCallbackHeaderRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
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

    
    public BswMgrNeedsWrapper getBswMgrNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswMgrNeeds){
            return new BswMgrNeedsWrapper((BswMgrNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ComMgrUserNeedsWrapper getComMgrUserNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ComMgrUserNeeds){
            return new ComMgrUserNeedsWrapper((ComMgrUserNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CryptoServiceNeedsWrapper getCryptoServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CryptoServiceNeeds){
            return new CryptoServiceNeedsWrapper((CryptoServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticCommunicationManagerNeedsWrapper getDiagnosticCommunicationManagerNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticCommunicationManagerNeeds){
            return new DiagnosticCommunicationManagerNeedsWrapper((DiagnosticCommunicationManagerNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEnableConditionNeedsWrapper getDiagnosticEnableConditionNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEnableConditionNeeds){
            return new DiagnosticEnableConditionNeedsWrapper((DiagnosticEnableConditionNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventInfoNeedsWrapper getDiagnosticEventInfoNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventInfoNeeds){
            return new DiagnosticEventInfoNeedsWrapper((DiagnosticEventInfoNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventManagerNeedsWrapper getDiagnosticEventManagerNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventManagerNeeds){
            return new DiagnosticEventManagerNeedsWrapper((DiagnosticEventManagerNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventNeedsWrapper getDiagnosticEventNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventNeeds){
            return new DiagnosticEventNeedsWrapper((DiagnosticEventNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticIoControlNeedsWrapper getDiagnosticIoControlNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticIoControlNeeds){
            return new DiagnosticIoControlNeedsWrapper((DiagnosticIoControlNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticOperationCycleNeedsWrapper getDiagnosticOperationCycleNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticOperationCycleNeeds){
            return new DiagnosticOperationCycleNeedsWrapper((DiagnosticOperationCycleNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRoutineNeedsWrapper getDiagnosticRoutineNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRoutineNeeds){
            return new DiagnosticRoutineNeedsWrapper((DiagnosticRoutineNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStorageConditionNeedsWrapper getDiagnosticStorageConditionNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStorageConditionNeeds){
            return new DiagnosticStorageConditionNeedsWrapper((DiagnosticStorageConditionNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticValueNeedsWrapper getDiagnosticValueNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticValueNeeds){
            return new DiagnosticValueNeedsWrapper((DiagnosticValueNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticsCommunicationSecurityNeedsWrapper getDiagnosticsCommunicationSecurityNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticsCommunicationSecurityNeeds){
            return new DiagnosticsCommunicationSecurityNeedsWrapper((DiagnosticsCommunicationSecurityNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DltUserNeedsWrapper getDltUserNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DltUserNeeds){
            return new DltUserNeedsWrapper((DltUserNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpActivationLineNeedsWrapper getDoIpActivationLineNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpActivationLineNeeds){
            return new DoIpActivationLineNeedsWrapper((DoIpActivationLineNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpGidNeedsWrapper getDoIpGidNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpGidNeeds){
            return new DoIpGidNeedsWrapper((DoIpGidNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpGidSynchronizationNeedsWrapper getDoIpGidSynchronizationNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpGidSynchronizationNeeds){
            return new DoIpGidSynchronizationNeedsWrapper((DoIpGidSynchronizationNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpPowerModeStatusNeedsWrapper getDoIpPowerModeStatusNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpPowerModeStatusNeeds){
            return new DoIpPowerModeStatusNeedsWrapper((DoIpPowerModeStatusNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpRoutingActivationAuthenticationNeedsWrapper getDoIpRoutingActivationAuthenticationNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpRoutingActivationAuthenticationNeeds){
            return new DoIpRoutingActivationAuthenticationNeedsWrapper((DoIpRoutingActivationAuthenticationNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpRoutingActivationConfirmationNeedsWrapper getDoIpRoutingActivationConfirmationNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpRoutingActivationConfirmationNeeds){
            return new DoIpRoutingActivationConfirmationNeedsWrapper((DoIpRoutingActivationConfirmationNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DtcStatusChangeNotificationNeedsWrapper getDtcStatusChangeNotificationNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DtcStatusChangeNotificationNeeds){
            return new DtcStatusChangeNotificationNeedsWrapper((DtcStatusChangeNotificationNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuStateMgrUserNeedsWrapper getEcuStateMgrUserNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuStateMgrUserNeeds){
            return new EcuStateMgrUserNeedsWrapper((EcuStateMgrUserNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FunctionInhibitionNeedsWrapper getFunctionInhibitionNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FunctionInhibitionNeeds){
            return new FunctionInhibitionNeedsWrapper((FunctionInhibitionNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvBlockNeedsWrapper getNvBlockNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvBlockNeeds){
            return new NvBlockNeedsWrapper((NvBlockNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdControlServiceNeedsWrapper getObdControlServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdControlServiceNeeds){
            return new ObdControlServiceNeedsWrapper((ObdControlServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdInfoServiceNeedsWrapper getObdInfoServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdInfoServiceNeeds){
            return new ObdInfoServiceNeedsWrapper((ObdInfoServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdMonitorServiceNeedsWrapper getObdMonitorServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdMonitorServiceNeeds){
            return new ObdMonitorServiceNeedsWrapper((ObdMonitorServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdPidServiceNeedsWrapper getObdPidServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdPidServiceNeeds){
            return new ObdPidServiceNeedsWrapper((ObdPidServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdRatioServiceNeedsWrapper getObdRatioServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdRatioServiceNeeds){
            return new ObdRatioServiceNeedsWrapper((ObdRatioServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SupervisedEntityNeedsWrapper getSupervisedEntityNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SupervisedEntityNeeds){
            return new SupervisedEntityNeedsWrapper((SupervisedEntityNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SyncTimeBaseMgrUserNeedsWrapper getSyncTimeBaseMgrUserNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SyncTimeBaseMgrUserNeeds){
            return new SyncTimeBaseMgrUserNeedsWrapper((SyncTimeBaseMgrUserNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public WarningIndicatorRequestedBitNeedsWrapper getWarningIndicatorRequestedBitNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = callbackHeaderRef.getValue();
        java.lang.String type = callbackHeaderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof WarningIndicatorRequestedBitNeeds){
            return new WarningIndicatorRequestedBitNeedsWrapper((WarningIndicatorRequestedBitNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}