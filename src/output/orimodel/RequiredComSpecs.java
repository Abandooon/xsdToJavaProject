package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RequiredComSpecs {

    
    
    protected ArrayList<ClientComSpec> clientComSpec;
    
    
    
    protected ArrayList<ModeSwitchReceiverComSpec> modeSwitchReceiverComSpec;
    
    
    
    protected ArrayList<NonqueuedReceiverComSpec> nonqueuedReceiverComSpec;
    
    
    
    protected ArrayList<NvRequireComSpec> nvRequireComSpec;
    
    
    
    protected ArrayList<ParameterRequireComSpec> parameterRequireComSpec;
    
    
    
    protected ArrayList<QueuedReceiverComSpec> queuedReceiverComSpec;
    
    

    
    
    @XmlElement(name="CLIENT-COM-SPEC")
    public ArrayList<ClientComSpec> getClientComSpec() {
    return this.clientComSpec;
}

    public void setClientComSpec(ArrayList<ClientComSpec> value) {
        this.clientComSpec = value;
    }
    
    
    
    @XmlElement(name="MODE-SWITCH-RECEIVER-COM-SPEC")
    public ArrayList<ModeSwitchReceiverComSpec> getModeSwitchReceiverComSpec() {
    return this.modeSwitchReceiverComSpec;
}

    public void setModeSwitchReceiverComSpec(ArrayList<ModeSwitchReceiverComSpec> value) {
        this.modeSwitchReceiverComSpec = value;
    }
    
    
    
    @XmlElement(name="NONQUEUED-RECEIVER-COM-SPEC")
    public ArrayList<NonqueuedReceiverComSpec> getNonqueuedReceiverComSpec() {
    return this.nonqueuedReceiverComSpec;
}

    public void setNonqueuedReceiverComSpec(ArrayList<NonqueuedReceiverComSpec> value) {
        this.nonqueuedReceiverComSpec = value;
    }
    
    
    
    @XmlElement(name="NV-REQUIRE-COM-SPEC")
    public ArrayList<NvRequireComSpec> getNvRequireComSpec() {
    return this.nvRequireComSpec;
}

    public void setNvRequireComSpec(ArrayList<NvRequireComSpec> value) {
        this.nvRequireComSpec = value;
    }
    
    
    
    @XmlElement(name="PARAMETER-REQUIRE-COM-SPEC")
    public ArrayList<ParameterRequireComSpec> getParameterRequireComSpec() {
    return this.parameterRequireComSpec;
}

    public void setParameterRequireComSpec(ArrayList<ParameterRequireComSpec> value) {
        this.parameterRequireComSpec = value;
    }
    
    
    
    @XmlElement(name="QUEUED-RECEIVER-COM-SPEC")
    public ArrayList<QueuedReceiverComSpec> getQueuedReceiverComSpec() {
    return this.queuedReceiverComSpec;
}

    public void setQueuedReceiverComSpec(ArrayList<QueuedReceiverComSpec> value) {
        this.queuedReceiverComSpec = value;
    }
    
    
}