package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ProvidedComSpecs {

    
    
    protected ArrayList<ModeSwitchSenderComSpec> modeSwitchSenderComSpec;
    
    
    
    protected ArrayList<NonqueuedSenderComSpec> nonqueuedSenderComSpec;
    
    
    
    protected ArrayList<NvProvideComSpec> nvProvideComSpec;
    
    
    
    protected ArrayList<ParameterProvideComSpec> parameterProvideComSpec;
    
    
    
    protected ArrayList<QueuedSenderComSpec> queuedSenderComSpec;
    
    
    
    protected ArrayList<ServerComSpec> serverComSpec;
    
    

    
    
    @XmlElement(name="MODE-SWITCH-SENDER-COM-SPEC")
    public ArrayList<ModeSwitchSenderComSpec> getModeSwitchSenderComSpec() {
    return this.modeSwitchSenderComSpec;
}

    public void setModeSwitchSenderComSpec(ArrayList<ModeSwitchSenderComSpec> value) {
        this.modeSwitchSenderComSpec = value;
    }
    
    
    
    @XmlElement(name="NONQUEUED-SENDER-COM-SPEC")
    public ArrayList<NonqueuedSenderComSpec> getNonqueuedSenderComSpec() {
    return this.nonqueuedSenderComSpec;
}

    public void setNonqueuedSenderComSpec(ArrayList<NonqueuedSenderComSpec> value) {
        this.nonqueuedSenderComSpec = value;
    }
    
    
    
    @XmlElement(name="NV-PROVIDE-COM-SPEC")
    public ArrayList<NvProvideComSpec> getNvProvideComSpec() {
    return this.nvProvideComSpec;
}

    public void setNvProvideComSpec(ArrayList<NvProvideComSpec> value) {
        this.nvProvideComSpec = value;
    }
    
    
    
    @XmlElement(name="PARAMETER-PROVIDE-COM-SPEC")
    public ArrayList<ParameterProvideComSpec> getParameterProvideComSpec() {
    return this.parameterProvideComSpec;
}

    public void setParameterProvideComSpec(ArrayList<ParameterProvideComSpec> value) {
        this.parameterProvideComSpec = value;
    }
    
    
    
    @XmlElement(name="QUEUED-SENDER-COM-SPEC")
    public ArrayList<QueuedSenderComSpec> getQueuedSenderComSpec() {
    return this.queuedSenderComSpec;
}

    public void setQueuedSenderComSpec(ArrayList<QueuedSenderComSpec> value) {
        this.queuedSenderComSpec = value;
    }
    
    
    
    @XmlElement(name="SERVER-COM-SPEC")
    public ArrayList<ServerComSpec> getServerComSpec() {
    return this.serverComSpec;
}

    public void setServerComSpec(ArrayList<ServerComSpec> value) {
        this.serverComSpec = value;
    }
    
    
}