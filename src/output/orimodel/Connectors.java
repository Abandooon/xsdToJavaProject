package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Connectors {

    
    
    protected ArrayList<CanCommunicationConnector> canCommunicationConnector;
    
    
    
    protected ArrayList<EthernetCommunicationConnector> ethernetCommunicationConnector;
    
    
    
    protected ArrayList<FlexrayCommunicationConnector> flexrayCommunicationConnector;
    
    
    
    protected ArrayList<LinCommunicationConnector> linCommunicationConnector;
    
    
    
    protected ArrayList<TtcanCommunicationConnector> ttcanCommunicationConnector;
    
    
    
    protected ArrayList<UserDefinedCommunicationConnector> userDefinedCommunicationConnector;
    
    

    
    
    @XmlElement(name="CAN-COMMUNICATION-CONNECTOR")
    public ArrayList<CanCommunicationConnector> getCanCommunicationConnector() {
    return this.canCommunicationConnector;
}

    public void setCanCommunicationConnector(ArrayList<CanCommunicationConnector> value) {
        this.canCommunicationConnector = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-COMMUNICATION-CONNECTOR")
    public ArrayList<EthernetCommunicationConnector> getEthernetCommunicationConnector() {
    return this.ethernetCommunicationConnector;
}

    public void setEthernetCommunicationConnector(ArrayList<EthernetCommunicationConnector> value) {
        this.ethernetCommunicationConnector = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-COMMUNICATION-CONNECTOR")
    public ArrayList<FlexrayCommunicationConnector> getFlexrayCommunicationConnector() {
    return this.flexrayCommunicationConnector;
}

    public void setFlexrayCommunicationConnector(ArrayList<FlexrayCommunicationConnector> value) {
        this.flexrayCommunicationConnector = value;
    }
    
    
    
    @XmlElement(name="LIN-COMMUNICATION-CONNECTOR")
    public ArrayList<LinCommunicationConnector> getLinCommunicationConnector() {
    return this.linCommunicationConnector;
}

    public void setLinCommunicationConnector(ArrayList<LinCommunicationConnector> value) {
        this.linCommunicationConnector = value;
    }
    
    
    
    @XmlElement(name="TTCAN-COMMUNICATION-CONNECTOR")
    public ArrayList<TtcanCommunicationConnector> getTtcanCommunicationConnector() {
    return this.ttcanCommunicationConnector;
}

    public void setTtcanCommunicationConnector(ArrayList<TtcanCommunicationConnector> value) {
        this.ttcanCommunicationConnector = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-COMMUNICATION-CONNECTOR")
    public ArrayList<UserDefinedCommunicationConnector> getUserDefinedCommunicationConnector() {
    return this.userDefinedCommunicationConnector;
}

    public void setUserDefinedCommunicationConnector(ArrayList<UserDefinedCommunicationConnector> value) {
        this.userDefinedCommunicationConnector = value;
    }
    
    
}