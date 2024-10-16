package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataMappings {

    
    
    protected ArrayList<ClientServerToSignalGroupMapping> clientServerToSignalGroupMapping;
    
    
    
    protected ArrayList<ClientServerToSignalMapping> clientServerToSignalMapping;
    
    
    
    protected ArrayList<SenderReceiverCompositeElementToSignalMapping> senderReceiverCompositeElementToSignalMapping;
    
    
    
    protected ArrayList<SenderReceiverToSignalGroupMapping> senderReceiverToSignalGroupMapping;
    
    
    
    protected ArrayList<SenderReceiverToSignalMapping> senderReceiverToSignalMapping;
    
    
    
    protected ArrayList<TriggerToSignalMapping> triggerToSignalMapping;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-TO-SIGNAL-GROUP-MAPPING")
    public ArrayList<ClientServerToSignalGroupMapping> getClientServerToSignalGroupMapping() {
    return this.clientServerToSignalGroupMapping;
}

    public void setClientServerToSignalGroupMapping(ArrayList<ClientServerToSignalGroupMapping> value) {
        this.clientServerToSignalGroupMapping = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVER-TO-SIGNAL-MAPPING")
    public ArrayList<ClientServerToSignalMapping> getClientServerToSignalMapping() {
    return this.clientServerToSignalMapping;
}

    public void setClientServerToSignalMapping(ArrayList<ClientServerToSignalMapping> value) {
        this.clientServerToSignalMapping = value;
    }
    
    
    
    @XmlElement(name="SENDER-RECEIVER-COMPOSITE-ELEMENT-TO-SIGNAL-MAPPING")
    public ArrayList<SenderReceiverCompositeElementToSignalMapping> getSenderReceiverCompositeElementToSignalMapping() {
    return this.senderReceiverCompositeElementToSignalMapping;
}

    public void setSenderReceiverCompositeElementToSignalMapping(ArrayList<SenderReceiverCompositeElementToSignalMapping> value) {
        this.senderReceiverCompositeElementToSignalMapping = value;
    }
    
    
    
    @XmlElement(name="SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING")
    public ArrayList<SenderReceiverToSignalGroupMapping> getSenderReceiverToSignalGroupMapping() {
    return this.senderReceiverToSignalGroupMapping;
}

    public void setSenderReceiverToSignalGroupMapping(ArrayList<SenderReceiverToSignalGroupMapping> value) {
        this.senderReceiverToSignalGroupMapping = value;
    }
    
    
    
    @XmlElement(name="SENDER-RECEIVER-TO-SIGNAL-MAPPING")
    public ArrayList<SenderReceiverToSignalMapping> getSenderReceiverToSignalMapping() {
    return this.senderReceiverToSignalMapping;
}

    public void setSenderReceiverToSignalMapping(ArrayList<SenderReceiverToSignalMapping> value) {
        this.senderReceiverToSignalMapping = value;
    }
    
    
    
    @XmlElement(name="TRIGGER-TO-SIGNAL-MAPPING")
    public ArrayList<TriggerToSignalMapping> getTriggerToSignalMapping() {
    return this.triggerToSignalMapping;
}

    public void setTriggerToSignalMapping(ArrayList<TriggerToSignalMapping> value) {
        this.triggerToSignalMapping = value;
    }
    
    
}