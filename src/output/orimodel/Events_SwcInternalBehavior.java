package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Events_SwcInternalBehavior {

    
    
    protected ArrayList<AsynchronousServerCallReturnsEvent> asynchronousServerCallReturnsEvent;
    
    
    
    protected ArrayList<BackgroundEvent> backgroundEvent;
    
    
    
    protected ArrayList<DataReceiveErrorEvent> dataReceiveErrorEvent;
    
    
    
    protected ArrayList<DataReceivedEvent> dataReceivedEvent;
    
    
    
    protected ArrayList<DataSendCompletedEvent> dataSendCompletedEvent;
    
    
    
    protected ArrayList<DataWriteCompletedEvent> dataWriteCompletedEvent;
    
    
    
    protected ArrayList<ExternalTriggerOccurredEvent> externalTriggerOccurredEvent;
    
    
    
    protected ArrayList<InitEvent> initEvent;
    
    
    
    protected ArrayList<InternalTriggerOccurredEvent> internalTriggerOccurredEvent;
    
    
    
    protected ArrayList<ModeSwitchedAckEvent> modeSwitchedAckEvent;
    
    
    
    protected ArrayList<OperationInvokedEvent> operationInvokedEvent;
    
    
    
    protected ArrayList<SwcModeManagerErrorEvent> swcModeManagerErrorEvent;
    
    
    
    protected ArrayList<SwcModeSwitchEvent> swcModeSwitchEvent;
    
    
    
    protected ArrayList<TimingEvent> timingEvent;
    
    
    
    protected ArrayList<TransformerHardErrorEvent> transformerHardErrorEvent;
    
    

    
    
    @XmlElement(name="ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    public ArrayList<AsynchronousServerCallReturnsEvent> getAsynchronousServerCallReturnsEvent() {
    return this.asynchronousServerCallReturnsEvent;
}

    public void setAsynchronousServerCallReturnsEvent(ArrayList<AsynchronousServerCallReturnsEvent> value) {
        this.asynchronousServerCallReturnsEvent = value;
    }
    
    
    
    @XmlElement(name="BACKGROUND-EVENT")
    public ArrayList<BackgroundEvent> getBackgroundEvent() {
    return this.backgroundEvent;
}

    public void setBackgroundEvent(ArrayList<BackgroundEvent> value) {
        this.backgroundEvent = value;
    }
    
    
    
    @XmlElement(name="DATA-RECEIVE-ERROR-EVENT")
    public ArrayList<DataReceiveErrorEvent> getDataReceiveErrorEvent() {
    return this.dataReceiveErrorEvent;
}

    public void setDataReceiveErrorEvent(ArrayList<DataReceiveErrorEvent> value) {
        this.dataReceiveErrorEvent = value;
    }
    
    
    
    @XmlElement(name="DATA-RECEIVED-EVENT")
    public ArrayList<DataReceivedEvent> getDataReceivedEvent() {
    return this.dataReceivedEvent;
}

    public void setDataReceivedEvent(ArrayList<DataReceivedEvent> value) {
        this.dataReceivedEvent = value;
    }
    
    
    
    @XmlElement(name="DATA-SEND-COMPLETED-EVENT")
    public ArrayList<DataSendCompletedEvent> getDataSendCompletedEvent() {
    return this.dataSendCompletedEvent;
}

    public void setDataSendCompletedEvent(ArrayList<DataSendCompletedEvent> value) {
        this.dataSendCompletedEvent = value;
    }
    
    
    
    @XmlElement(name="DATA-WRITE-COMPLETED-EVENT")
    public ArrayList<DataWriteCompletedEvent> getDataWriteCompletedEvent() {
    return this.dataWriteCompletedEvent;
}

    public void setDataWriteCompletedEvent(ArrayList<DataWriteCompletedEvent> value) {
        this.dataWriteCompletedEvent = value;
    }
    
    
    
    @XmlElement(name="EXTERNAL-TRIGGER-OCCURRED-EVENT")
    public ArrayList<ExternalTriggerOccurredEvent> getExternalTriggerOccurredEvent() {
    return this.externalTriggerOccurredEvent;
}

    public void setExternalTriggerOccurredEvent(ArrayList<ExternalTriggerOccurredEvent> value) {
        this.externalTriggerOccurredEvent = value;
    }
    
    
    
    @XmlElement(name="INIT-EVENT")
    public ArrayList<InitEvent> getInitEvent() {
    return this.initEvent;
}

    public void setInitEvent(ArrayList<InitEvent> value) {
        this.initEvent = value;
    }
    
    
    
    @XmlElement(name="INTERNAL-TRIGGER-OCCURRED-EVENT")
    public ArrayList<InternalTriggerOccurredEvent> getInternalTriggerOccurredEvent() {
    return this.internalTriggerOccurredEvent;
}

    public void setInternalTriggerOccurredEvent(ArrayList<InternalTriggerOccurredEvent> value) {
        this.internalTriggerOccurredEvent = value;
    }
    
    
    
    @XmlElement(name="MODE-SWITCHED-ACK-EVENT")
    public ArrayList<ModeSwitchedAckEvent> getModeSwitchedAckEvent() {
    return this.modeSwitchedAckEvent;
}

    public void setModeSwitchedAckEvent(ArrayList<ModeSwitchedAckEvent> value) {
        this.modeSwitchedAckEvent = value;
    }
    
    
    
    @XmlElement(name="OPERATION-INVOKED-EVENT")
    public ArrayList<OperationInvokedEvent> getOperationInvokedEvent() {
    return this.operationInvokedEvent;
}

    public void setOperationInvokedEvent(ArrayList<OperationInvokedEvent> value) {
        this.operationInvokedEvent = value;
    }
    
    
    
    @XmlElement(name="SWC-MODE-MANAGER-ERROR-EVENT")
    public ArrayList<SwcModeManagerErrorEvent> getSwcModeManagerErrorEvent() {
    return this.swcModeManagerErrorEvent;
}

    public void setSwcModeManagerErrorEvent(ArrayList<SwcModeManagerErrorEvent> value) {
        this.swcModeManagerErrorEvent = value;
    }
    
    
    
    @XmlElement(name="SWC-MODE-SWITCH-EVENT")
    public ArrayList<SwcModeSwitchEvent> getSwcModeSwitchEvent() {
    return this.swcModeSwitchEvent;
}

    public void setSwcModeSwitchEvent(ArrayList<SwcModeSwitchEvent> value) {
        this.swcModeSwitchEvent = value;
    }
    
    
    
    @XmlElement(name="TIMING-EVENT")
    public ArrayList<TimingEvent> getTimingEvent() {
    return this.timingEvent;
}

    public void setTimingEvent(ArrayList<TimingEvent> value) {
        this.timingEvent = value;
    }
    
    
    
    @XmlElement(name="TRANSFORMER-HARD-ERROR-EVENT")
    public ArrayList<TransformerHardErrorEvent> getTransformerHardErrorEvent() {
    return this.transformerHardErrorEvent;
}

    public void setTransformerHardErrorEvent(ArrayList<TransformerHardErrorEvent> value) {
        this.transformerHardErrorEvent = value;
    }
    
    
}