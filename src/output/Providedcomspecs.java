package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Providedcomspecs {

    
    
    protected ArrayList<ModeSwitchSenderComSpec> modeSwitchSenderComSpecs;
    
    
    
    protected ArrayList<NonqueuedSenderComSpec> nonqueuedSenderComSpecs;
    
    
    
    protected ArrayList<NvProvideComSpec> nvProvideComSpecs;
    
    
    
    protected ArrayList<ParameterProvideComSpec> parameterProvideComSpecs;
    
    
    
    protected ArrayList<QueuedSenderComSpec> queuedSenderComSpecs;
    
    
    
    protected ArrayList<ServerComSpec> serverComSpecs;
    
    

    
    
    @XmlElement(name="MODE-SWITCH-SENDER-COM-SPEC")
    public ArrayList<ModeSwitchSenderComSpec> getModeSwitchSenderComSpecs() {
        return this.modeSwitchSenderComSpecs;
    }

    public void setModeSwitchSenderComSpecs(ArrayList<ModeSwitchSenderComSpec> value) {
        this.modeSwitchSenderComSpecs = value;
    }
    
    
    
    @XmlElement(name="NONQUEUED-SENDER-COM-SPEC")
    public ArrayList<NonqueuedSenderComSpec> getNonqueuedSenderComSpecs() {
        return this.nonqueuedSenderComSpecs;
    }

    public void setNonqueuedSenderComSpecs(ArrayList<NonqueuedSenderComSpec> value) {
        this.nonqueuedSenderComSpecs = value;
    }
    
    
    
    @XmlElement(name="NV-PROVIDE-COM-SPEC")
    public ArrayList<NvProvideComSpec> getNvProvideComSpecs() {
        return this.nvProvideComSpecs;
    }

    public void setNvProvideComSpecs(ArrayList<NvProvideComSpec> value) {
        this.nvProvideComSpecs = value;
    }
    
    
    
    @XmlElement(name="PARAMETER-PROVIDE-COM-SPEC")
    public ArrayList<ParameterProvideComSpec> getParameterProvideComSpecs() {
        return this.parameterProvideComSpecs;
    }

    public void setParameterProvideComSpecs(ArrayList<ParameterProvideComSpec> value) {
        this.parameterProvideComSpecs = value;
    }
    
    
    
    @XmlElement(name="QUEUED-SENDER-COM-SPEC")
    public ArrayList<QueuedSenderComSpec> getQueuedSenderComSpecs() {
        return this.queuedSenderComSpecs;
    }

    public void setQueuedSenderComSpecs(ArrayList<QueuedSenderComSpec> value) {
        this.queuedSenderComSpecs = value;
    }
    
    
    
    @XmlElement(name="SERVER-COM-SPEC")
    public ArrayList<ServerComSpec> getServerComSpecs() {
        return this.serverComSpecs;
    }

    public void setServerComSpecs(ArrayList<ServerComSpec> value) {
        this.serverComSpecs = value;
    }
    
    
}