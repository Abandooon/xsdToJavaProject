package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Events {

    
    
    protected ArrayList<AsynchronousServerCallReturnsEvent> asynchronousServerCallReturnsEvents;
    
    
    
    protected ArrayList<BackgroundEvent> backgroundEvents;
    
    
    
    protected ArrayList<DataReceiveErrorEvent> dataReceiveErrorEvents;
    
    
    
    protected ArrayList<DataReceivedEvent> dataReceivedEvents;
    
    
    
    protected ArrayList<DataSendCompletedEvent> dataSendCompletedEvents;
    
    
    
    protected ArrayList<DataWriteCompletedEvent> dataWriteCompletedEvents;
    
    
    
    protected ArrayList<ExternalTriggerOccurredEvent> externalTriggerOccurredEvents;
    
    
    
    protected ArrayList<InitEvent> initEvents;
    
    
    
    protected ArrayList<InternalTriggerOccurredEvent> internalTriggerOccurredEvents;
    
    
    
    protected ArrayList<ModeSwitchedAckEvent> modeSwitchedAckEvents;
    
    
    
    protected ArrayList<OperationInvokedEvent> operationInvokedEvents;
    
    
    
    protected ArrayList<SwcModeManagerErrorEvent> swcModeManagerErrorEvents;
    
    
    
    protected ArrayList<SwcModeSwitchEvent> swcModeSwitchEvents;
    
    
    
    protected ArrayList<TimingEvent> timingEvents;
    
    
    
    protected ArrayList<TransformerHardErrorEvent> transformerHardErrorEvents;
    
    

    
    
    @XmlElement(name="ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    public ArrayList<AsynchronousServerCallReturnsEvent> getAsynchronousServerCallReturnsEvents() {
        return this.asynchronousServerCallReturnsEvents;
    }

    public void setAsynchronousServerCallReturnsEvents(ArrayList<AsynchronousServerCallReturnsEvent> value) {
        this.asynchronousServerCallReturnsEvents = value;
    }
    
    
    
    @XmlElement(name="BACKGROUND-EVENT")
    public ArrayList<BackgroundEvent> getBackgroundEvents() {
        return this.backgroundEvents;
    }

    public void setBackgroundEvents(ArrayList<BackgroundEvent> value) {
        this.backgroundEvents = value;
    }
    
    
    
    @XmlElement(name="DATA-RECEIVE-ERROR-EVENT")
    public ArrayList<DataReceiveErrorEvent> getDataReceiveErrorEvents() {
        return this.dataReceiveErrorEvents;
    }

    public void setDataReceiveErrorEvents(ArrayList<DataReceiveErrorEvent> value) {
        this.dataReceiveErrorEvents = value;
    }
    
    
    
    @XmlElement(name="DATA-RECEIVED-EVENT")
    public ArrayList<DataReceivedEvent> getDataReceivedEvents() {
        return this.dataReceivedEvents;
    }

    public void setDataReceivedEvents(ArrayList<DataReceivedEvent> value) {
        this.dataReceivedEvents = value;
    }
    
    
    
    @XmlElement(name="DATA-SEND-COMPLETED-EVENT")
    public ArrayList<DataSendCompletedEvent> getDataSendCompletedEvents() {
        return this.dataSendCompletedEvents;
    }

    public void setDataSendCompletedEvents(ArrayList<DataSendCompletedEvent> value) {
        this.dataSendCompletedEvents = value;
    }
    
    
    
    @XmlElement(name="DATA-WRITE-COMPLETED-EVENT")
    public ArrayList<DataWriteCompletedEvent> getDataWriteCompletedEvents() {
        return this.dataWriteCompletedEvents;
    }

    public void setDataWriteCompletedEvents(ArrayList<DataWriteCompletedEvent> value) {
        this.dataWriteCompletedEvents = value;
    }
    
    
    
    @XmlElement(name="EXTERNAL-TRIGGER-OCCURRED-EVENT")
    public ArrayList<ExternalTriggerOccurredEvent> getExternalTriggerOccurredEvents() {
        return this.externalTriggerOccurredEvents;
    }

    public void setExternalTriggerOccurredEvents(ArrayList<ExternalTriggerOccurredEvent> value) {
        this.externalTriggerOccurredEvents = value;
    }
    
    
    
    @XmlElement(name="INIT-EVENT")
    public ArrayList<InitEvent> getInitEvents() {
        return this.initEvents;
    }

    public void setInitEvents(ArrayList<InitEvent> value) {
        this.initEvents = value;
    }
    
    
    
    @XmlElement(name="INTERNAL-TRIGGER-OCCURRED-EVENT")
    public ArrayList<InternalTriggerOccurredEvent> getInternalTriggerOccurredEvents() {
        return this.internalTriggerOccurredEvents;
    }

    public void setInternalTriggerOccurredEvents(ArrayList<InternalTriggerOccurredEvent> value) {
        this.internalTriggerOccurredEvents = value;
    }
    
    
    
    @XmlElement(name="MODE-SWITCHED-ACK-EVENT")
    public ArrayList<ModeSwitchedAckEvent> getModeSwitchedAckEvents() {
        return this.modeSwitchedAckEvents;
    }

    public void setModeSwitchedAckEvents(ArrayList<ModeSwitchedAckEvent> value) {
        this.modeSwitchedAckEvents = value;
    }
    
    
    
    @XmlElement(name="OPERATION-INVOKED-EVENT")
    public ArrayList<OperationInvokedEvent> getOperationInvokedEvents() {
        return this.operationInvokedEvents;
    }

    public void setOperationInvokedEvents(ArrayList<OperationInvokedEvent> value) {
        this.operationInvokedEvents = value;
    }
    
    
    
    @XmlElement(name="SWC-MODE-MANAGER-ERROR-EVENT")
    public ArrayList<SwcModeManagerErrorEvent> getSwcModeManagerErrorEvents() {
        return this.swcModeManagerErrorEvents;
    }

    public void setSwcModeManagerErrorEvents(ArrayList<SwcModeManagerErrorEvent> value) {
        this.swcModeManagerErrorEvents = value;
    }
    
    
    
    @XmlElement(name="SWC-MODE-SWITCH-EVENT")
    public ArrayList<SwcModeSwitchEvent> getSwcModeSwitchEvents() {
        return this.swcModeSwitchEvents;
    }

    public void setSwcModeSwitchEvents(ArrayList<SwcModeSwitchEvent> value) {
        this.swcModeSwitchEvents = value;
    }
    
    
    
    @XmlElement(name="TIMING-EVENT")
    public ArrayList<TimingEvent> getTimingEvents() {
        return this.timingEvents;
    }

    public void setTimingEvents(ArrayList<TimingEvent> value) {
        this.timingEvents = value;
    }
    
    
    
    @XmlElement(name="TRANSFORMER-HARD-ERROR-EVENT")
    public ArrayList<TransformerHardErrorEvent> getTransformerHardErrorEvents() {
        return this.transformerHardErrorEvents;
    }

    public void setTransformerHardErrorEvents(ArrayList<TransformerHardErrorEvent> value) {
        this.transformerHardErrorEvents = value;
    }
    
    
}