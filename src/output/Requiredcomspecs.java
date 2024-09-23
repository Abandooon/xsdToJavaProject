package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Requiredcomspecs {

    
    
    protected ArrayList<ClientComSpec> clientComSpecs;
    
    
    
    protected ArrayList<ModeSwitchReceiverComSpec> modeSwitchReceiverComSpecs;
    
    
    
    protected ArrayList<NonqueuedReceiverComSpec> nonqueuedReceiverComSpecs;
    
    
    
    protected ArrayList<NvRequireComSpec> nvRequireComSpecs;
    
    
    
    protected ArrayList<ParameterRequireComSpec> parameterRequireComSpecs;
    
    
    
    protected ArrayList<QueuedReceiverComSpec> queuedReceiverComSpecs;
    
    

    
    
    @XmlElement(name="CLIENT-COM-SPEC")
    public ArrayList<ClientComSpec> getClientComSpecs() {
        return this.clientComSpecs;
    }

    public void setClientComSpecs(ArrayList<ClientComSpec> value) {
        this.clientComSpecs = value;
    }
    
    
    
    @XmlElement(name="MODE-SWITCH-RECEIVER-COM-SPEC")
    public ArrayList<ModeSwitchReceiverComSpec> getModeSwitchReceiverComSpecs() {
        return this.modeSwitchReceiverComSpecs;
    }

    public void setModeSwitchReceiverComSpecs(ArrayList<ModeSwitchReceiverComSpec> value) {
        this.modeSwitchReceiverComSpecs = value;
    }
    
    
    
    @XmlElement(name="NONQUEUED-RECEIVER-COM-SPEC")
    public ArrayList<NonqueuedReceiverComSpec> getNonqueuedReceiverComSpecs() {
        return this.nonqueuedReceiverComSpecs;
    }

    public void setNonqueuedReceiverComSpecs(ArrayList<NonqueuedReceiverComSpec> value) {
        this.nonqueuedReceiverComSpecs = value;
    }
    
    
    
    @XmlElement(name="NV-REQUIRE-COM-SPEC")
    public ArrayList<NvRequireComSpec> getNvRequireComSpecs() {
        return this.nvRequireComSpecs;
    }

    public void setNvRequireComSpecs(ArrayList<NvRequireComSpec> value) {
        this.nvRequireComSpecs = value;
    }
    
    
    
    @XmlElement(name="PARAMETER-REQUIRE-COM-SPEC")
    public ArrayList<ParameterRequireComSpec> getParameterRequireComSpecs() {
        return this.parameterRequireComSpecs;
    }

    public void setParameterRequireComSpecs(ArrayList<ParameterRequireComSpec> value) {
        this.parameterRequireComSpecs = value;
    }
    
    
    
    @XmlElement(name="QUEUED-RECEIVER-COM-SPEC")
    public ArrayList<QueuedReceiverComSpec> getQueuedReceiverComSpecs() {
        return this.queuedReceiverComSpecs;
    }

    public void setQueuedReceiverComSpecs(ArrayList<QueuedReceiverComSpec> value) {
        this.queuedReceiverComSpecs = value;
    }
    
    
}