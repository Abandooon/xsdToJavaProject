package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.System;
     

     

     

     

     

     

public class TargetRefWrapper {

    
    
    private TargetRef targetRef;

    public TargetRefWrapper(TargetRef targetRef) {
        this.targetRef = targetRef;
    }

   
    public AtpFeatureSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetRef.getDest())) {
            
            return targetRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
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

    
    public ApplicationArrayElementWrapper getApplicationArrayElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationArrayElement){
            return new ApplicationArrayElementWrapper((ApplicationArrayElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationRecordElementWrapper getApplicationRecordElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationRecordElement){
            return new ApplicationRecordElementWrapper((ApplicationRecordElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ArgumentDataPrototypeWrapper getArgumentDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ArgumentDataPrototype){
            return new ArgumentDataPrototypeWrapper((ArgumentDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AssemblySwConnectorWrapper getAssemblySwConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AssemblySwConnector){
            return new AssemblySwConnectorWrapper((AssemblySwConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AsynchronousServerCallPointWrapper getAsynchronousServerCallPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AsynchronousServerCallPoint){
            return new AsynchronousServerCallPointWrapper((AsynchronousServerCallPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AsynchronousServerCallResultPointWrapper getAsynchronousServerCallResultPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AsynchronousServerCallResultPoint){
            return new AsynchronousServerCallResultPointWrapper((AsynchronousServerCallResultPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AsynchronousServerCallReturnsEventWrapper getAsynchronousServerCallReturnsEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AsynchronousServerCallReturnsEvent){
            return new AsynchronousServerCallReturnsEventWrapper((AsynchronousServerCallReturnsEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BackgroundEventWrapper getBackgroundEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BackgroundEvent){
            return new BackgroundEventWrapper((BackgroundEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswInternalBehaviorWrapper getBswInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalBehavior){
            return new BswInternalBehaviorWrapper((BswInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModuleDescriptionWrapper getBswModuleDescription() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleDescription){
            return new BswModuleDescriptionWrapper((BswModuleDescription) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswServiceDependencyIdentWrapper getBswServiceDependencyIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswServiceDependencyIdent){
            return new BswServiceDependencyIdentWrapper((BswServiceDependencyIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ClientServerOperationWrapper getClientServerOperation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerOperation){
            return new ClientServerOperationWrapper((ClientServerOperation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataPrototypeGroupWrapper getDataPrototypeGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataPrototypeGroup){
            return new DataPrototypeGroupWrapper((DataPrototypeGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataReceiveErrorEventWrapper getDataReceiveErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataReceiveErrorEvent){
            return new DataReceiveErrorEventWrapper((DataReceiveErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataReceivedEventWrapper getDataReceivedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataReceivedEvent){
            return new DataReceivedEventWrapper((DataReceivedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataSendCompletedEventWrapper getDataSendCompletedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataSendCompletedEvent){
            return new DataSendCompletedEventWrapper((DataSendCompletedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataWriteCompletedEventWrapper getDataWriteCompletedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataWriteCompletedEvent){
            return new DataWriteCompletedEventWrapper((DataWriteCompletedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DelegationSwConnectorWrapper getDelegationSwConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DelegationSwConnector){
            return new DelegationSwConnectorWrapper((DelegationSwConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExternalTriggerOccurredEventWrapper getExternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExternalTriggerOccurredEvent){
            return new ExternalTriggerOccurredEventWrapper((ExternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExternalTriggeringPointIdentWrapper getExternalTriggeringPointIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExternalTriggeringPointIdent){
            return new ExternalTriggeringPointIdentWrapper((ExternalTriggeringPointIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InitEventWrapper getInitEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InitEvent){
            return new InitEventWrapper((InitEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InternalTriggerOccurredEventWrapper getInternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InternalTriggerOccurredEvent){
            return new InternalTriggerOccurredEventWrapper((InternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InternalTriggeringPointWrapper getInternalTriggeringPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InternalTriggeringPoint){
            return new InternalTriggeringPointWrapper((InternalTriggeringPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeAccessPointIdentWrapper getModeAccessPointIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeAccessPointIdent){
            return new ModeAccessPointIdentWrapper((ModeAccessPointIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationWrapper getModeDeclaration() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclaration){
            return new ModeDeclarationWrapper((ModeDeclaration) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationGroupPrototypeWrapper getModeDeclarationGroupPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationGroupPrototype){
            return new ModeDeclarationGroupPrototypeWrapper((ModeDeclarationGroupPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationMappingWrapper getModeDeclarationMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationMapping){
            return new ModeDeclarationMappingWrapper((ModeDeclarationMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeSwitchPointWrapper getModeSwitchPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchPoint){
            return new ModeSwitchPointWrapper((ModeSwitchPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeSwitchedAckEventWrapper getModeSwitchedAckEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchedAckEvent){
            return new ModeSwitchedAckEventWrapper((ModeSwitchedAckEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeTransitionWrapper getModeTransition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeTransition){
            return new ModeTransitionWrapper((ModeTransition) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvBlockDescriptorWrapper getNvBlockDescriptor() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvBlockDescriptor){
            return new NvBlockDescriptorWrapper((NvBlockDescriptor) queryObject);
        }else{
            return null;
        }
        
    }
    
    public OperationInvokedEventWrapper getOperationInvokedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof OperationInvokedEvent){
            return new OperationInvokedEventWrapper((OperationInvokedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PPortPrototypeWrapper getPPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PPortPrototype){
            return new PPortPrototypeWrapper((PPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PrPortPrototypeWrapper getPrPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PrPortPrototype){
            return new PrPortPrototypeWrapper((PrPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterAccessWrapper getParameterAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterAccess){
            return new ParameterAccessWrapper((ParameterAccess) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterDataPrototypeWrapper getParameterDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterDataPrototype){
            return new ParameterDataPrototypeWrapper((ParameterDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PassThroughSwConnectorWrapper getPassThroughSwConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PassThroughSwConnector){
            return new PassThroughSwConnectorWrapper((PassThroughSwConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PerInstanceMemoryWrapper getPerInstanceMemory() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PerInstanceMemory){
            return new PerInstanceMemoryWrapper((PerInstanceMemory) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PortGroupWrapper getPortGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortGroup){
            return new PortGroupWrapper((PortGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PortPrototypeBlueprintWrapper getPortPrototypeBlueprint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortPrototypeBlueprint){
            return new PortPrototypeBlueprintWrapper((PortPrototypeBlueprint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RPortPrototypeWrapper getRPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RPortPrototype){
            return new RPortPrototypeWrapper((RPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RootSwCompositionPrototypeWrapper getRootSwCompositionPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RootSwCompositionPrototype){
            return new RootSwCompositionPrototypeWrapper((RootSwCompositionPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RunnableEntityWrapper getRunnableEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RunnableEntity){
            return new RunnableEntityWrapper((RunnableEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RunnableEntityGroupWrapper getRunnableEntityGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RunnableEntityGroup){
            return new RunnableEntityGroupWrapper((RunnableEntityGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwComponentPrototypeWrapper getSwComponentPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwComponentPrototype){
            return new SwComponentPrototypeWrapper((SwComponentPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcBswMappingWrapper getSwcBswMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcBswMapping){
            return new SwcBswMappingWrapper((SwcBswMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcInternalBehaviorWrapper getSwcInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcInternalBehavior){
            return new SwcInternalBehaviorWrapper((SwcInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcModeManagerErrorEventWrapper getSwcModeManagerErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcModeManagerErrorEvent){
            return new SwcModeManagerErrorEventWrapper((SwcModeManagerErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcModeSwitchEventWrapper getSwcModeSwitchEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcModeSwitchEvent){
            return new SwcModeSwitchEventWrapper((SwcModeSwitchEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcServiceDependencyWrapper getSwcServiceDependency() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcServiceDependency){
            return new SwcServiceDependencyWrapper((SwcServiceDependency) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SynchronousServerCallPointWrapper getSynchronousServerCallPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SynchronousServerCallPoint){
            return new SynchronousServerCallPointWrapper((SynchronousServerCallPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SystemWrapper getSystem() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof System){
            return new SystemWrapper((System) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TimingEventWrapper getTimingEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TimingEvent){
            return new TimingEventWrapper((TimingEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TransformerHardErrorEventWrapper getTransformerHardErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TransformerHardErrorEvent){
            return new TransformerHardErrorEventWrapper((TransformerHardErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TriggerWrapper getTrigger() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Trigger){
            return new TriggerWrapper((Trigger) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariableAccessWrapper getVariableAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableAccess){
            return new VariableAccessWrapper((VariableAccess) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariableDataPrototypeWrapper getVariableDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef.getValue();
        java.lang.String type = targetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableDataPrototype){
            return new VariableDataPrototypeWrapper((VariableDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}