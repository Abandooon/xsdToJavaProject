package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class EventRef_EocEventRefWrapper {

    
    
    private EventRef_EocEventRef eventRef_EocEventRef;

    public EventRef_EocEventRefWrapper(EventRef_EocEventRef eventRef_EocEventRef) {
        this.eventRef_EocEventRef = eventRef_EocEventRef;
    }

   
    public AbstractEventSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(eventRef_EocEventRef.getDest())) {
            
            return eventRef_EocEventRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEventRef_EocEventRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
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

    
    public AsynchronousServerCallReturnsEventWrapper getAsynchronousServerCallReturnsEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BackgroundEvent){
            return new BackgroundEventWrapper((BackgroundEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswAsynchronousServerCallReturnsEventWrapper getBswAsynchronousServerCallReturnsEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswAsynchronousServerCallReturnsEvent){
            return new BswAsynchronousServerCallReturnsEventWrapper((BswAsynchronousServerCallReturnsEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswBackgroundEventWrapper getBswBackgroundEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswBackgroundEvent){
            return new BswBackgroundEventWrapper((BswBackgroundEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswDataReceivedEventWrapper getBswDataReceivedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswDataReceivedEvent){
            return new BswDataReceivedEventWrapper((BswDataReceivedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswExternalTriggerOccurredEventWrapper getBswExternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswExternalTriggerOccurredEvent){
            return new BswExternalTriggerOccurredEventWrapper((BswExternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswInternalTriggerOccurredEventWrapper getBswInternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalTriggerOccurredEvent){
            return new BswInternalTriggerOccurredEventWrapper((BswInternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModeManagerErrorEventWrapper getBswModeManagerErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModeManagerErrorEvent){
            return new BswModeManagerErrorEventWrapper((BswModeManagerErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModeSwitchEventWrapper getBswModeSwitchEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModeSwitchEvent){
            return new BswModeSwitchEventWrapper((BswModeSwitchEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModeSwitchedAckEventWrapper getBswModeSwitchedAckEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModeSwitchedAckEvent){
            return new BswModeSwitchedAckEventWrapper((BswModeSwitchedAckEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswOperationInvokedEventWrapper getBswOperationInvokedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswOperationInvokedEvent){
            return new BswOperationInvokedEventWrapper((BswOperationInvokedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswTimingEventWrapper getBswTimingEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswTimingEvent){
            return new BswTimingEventWrapper((BswTimingEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataReceiveErrorEventWrapper getDataReceiveErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataWriteCompletedEvent){
            return new DataWriteCompletedEventWrapper((DataWriteCompletedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExternalTriggerOccurredEventWrapper getExternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExternalTriggerOccurredEvent){
            return new ExternalTriggerOccurredEventWrapper((ExternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InitEventWrapper getInitEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InternalTriggerOccurredEvent){
            return new InternalTriggerOccurredEventWrapper((InternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeSwitchedAckEventWrapper getModeSwitchedAckEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchedAckEvent){
            return new ModeSwitchedAckEventWrapper((ModeSwitchedAckEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public OperationInvokedEventWrapper getOperationInvokedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof OperationInvokedEvent){
            return new OperationInvokedEventWrapper((OperationInvokedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcModeManagerErrorEventWrapper getSwcModeManagerErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcModeSwitchEvent){
            return new SwcModeSwitchEventWrapper((SwcModeSwitchEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TimingEventWrapper getTimingEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = eventRef_EocEventRef.getValue();
        java.lang.String type = eventRef_EocEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TransformerHardErrorEvent){
            return new TransformerHardErrorEventWrapper((TransformerHardErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}