package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class TargetRteEventRefWrapper {

    
    
    private TargetRteEventRef targetRteEventRef;

    public TargetRteEventRefWrapper(TargetRteEventRef targetRteEventRef) {
        this.targetRteEventRef = targetRteEventRef;
    }

   
    public RteEventSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetRteEventRef.getDest())) {
            
            return targetRteEventRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetRteEventRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BackgroundEvent){
            return new BackgroundEventWrapper((BackgroundEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataReceiveErrorEventWrapper getDataReceiveErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRteEventRef.getValue();
        java.lang.String type = targetRteEventRef.getDest().toString().replace("_", "-");
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