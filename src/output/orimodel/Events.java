package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Events {

    
    
    protected ArrayList<BswAsynchronousServerCallReturnsEvent> bswAsynchronousServerCallReturnsEvent;
    
    
    
    protected ArrayList<BswBackgroundEvent> bswBackgroundEvent;
    
    
    
    protected ArrayList<BswDataReceivedEvent> bswDataReceivedEvent;
    
    
    
    protected ArrayList<BswExternalTriggerOccurredEvent> bswExternalTriggerOccurredEvent;
    
    
    
    protected ArrayList<BswInternalTriggerOccurredEvent> bswInternalTriggerOccurredEvent;
    
    
    
    protected ArrayList<BswModeManagerErrorEvent> bswModeManagerErrorEvent;
    
    
    
    protected ArrayList<BswModeSwitchEvent> bswModeSwitchEvent;
    
    
    
    protected ArrayList<BswModeSwitchedAckEvent> bswModeSwitchedAckEvent;
    
    
    
    protected ArrayList<BswOperationInvokedEvent> bswOperationInvokedEvent;
    
    
    
    protected ArrayList<BswTimingEvent> bswTimingEvent;
    
    

    
    
    @XmlElement(name="BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    public ArrayList<BswAsynchronousServerCallReturnsEvent> getBswAsynchronousServerCallReturnsEvent() {
    return this.bswAsynchronousServerCallReturnsEvent;
}

    public void setBswAsynchronousServerCallReturnsEvent(ArrayList<BswAsynchronousServerCallReturnsEvent> value) {
        this.bswAsynchronousServerCallReturnsEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-BACKGROUND-EVENT")
    public ArrayList<BswBackgroundEvent> getBswBackgroundEvent() {
    return this.bswBackgroundEvent;
}

    public void setBswBackgroundEvent(ArrayList<BswBackgroundEvent> value) {
        this.bswBackgroundEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-DATA-RECEIVED-EVENT")
    public ArrayList<BswDataReceivedEvent> getBswDataReceivedEvent() {
    return this.bswDataReceivedEvent;
}

    public void setBswDataReceivedEvent(ArrayList<BswDataReceivedEvent> value) {
        this.bswDataReceivedEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT")
    public ArrayList<BswExternalTriggerOccurredEvent> getBswExternalTriggerOccurredEvent() {
    return this.bswExternalTriggerOccurredEvent;
}

    public void setBswExternalTriggerOccurredEvent(ArrayList<BswExternalTriggerOccurredEvent> value) {
        this.bswExternalTriggerOccurredEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-INTERNAL-TRIGGER-OCCURRED-EVENT")
    public ArrayList<BswInternalTriggerOccurredEvent> getBswInternalTriggerOccurredEvent() {
    return this.bswInternalTriggerOccurredEvent;
}

    public void setBswInternalTriggerOccurredEvent(ArrayList<BswInternalTriggerOccurredEvent> value) {
        this.bswInternalTriggerOccurredEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-MODE-MANAGER-ERROR-EVENT")
    public ArrayList<BswModeManagerErrorEvent> getBswModeManagerErrorEvent() {
    return this.bswModeManagerErrorEvent;
}

    public void setBswModeManagerErrorEvent(ArrayList<BswModeManagerErrorEvent> value) {
        this.bswModeManagerErrorEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-MODE-SWITCH-EVENT")
    public ArrayList<BswModeSwitchEvent> getBswModeSwitchEvent() {
    return this.bswModeSwitchEvent;
}

    public void setBswModeSwitchEvent(ArrayList<BswModeSwitchEvent> value) {
        this.bswModeSwitchEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-MODE-SWITCHED-ACK-EVENT")
    public ArrayList<BswModeSwitchedAckEvent> getBswModeSwitchedAckEvent() {
    return this.bswModeSwitchedAckEvent;
}

    public void setBswModeSwitchedAckEvent(ArrayList<BswModeSwitchedAckEvent> value) {
        this.bswModeSwitchedAckEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-OPERATION-INVOKED-EVENT")
    public ArrayList<BswOperationInvokedEvent> getBswOperationInvokedEvent() {
    return this.bswOperationInvokedEvent;
}

    public void setBswOperationInvokedEvent(ArrayList<BswOperationInvokedEvent> value) {
        this.bswOperationInvokedEvent = value;
    }
    
    
    
    @XmlElement(name="BSW-TIMING-EVENT")
    public ArrayList<BswTimingEvent> getBswTimingEvent() {
    return this.bswTimingEvent;
}

    public void setBswTimingEvent(ArrayList<BswTimingEvent> value) {
        this.bswTimingEvent = value;
    }
    
    
}