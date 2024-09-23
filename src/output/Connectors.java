package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Connectors {

    
    
    protected ArrayList<CanCommunicationConnector> canCommunicationConnectors;
    
    
    
    protected ArrayList<EthernetCommunicationConnector> ethernetCommunicationConnectors;
    
    
    
    protected ArrayList<FlexrayCommunicationConnector> flexrayCommunicationConnectors;
    
    
    
    protected ArrayList<LinCommunicationConnector> linCommunicationConnectors;
    
    
    
    protected ArrayList<TtcanCommunicationConnector> ttcanCommunicationConnectors;
    
    
    
    protected ArrayList<UserDefinedCommunicationConnector> userDefinedCommunicationConnectors;
    
    

    
    
    @XmlElement(name="CAN-COMMUNICATION-CONNECTOR")
    public ArrayList<CanCommunicationConnector> getCanCommunicationConnectors() {
        return this.canCommunicationConnectors;
    }

    public void setCanCommunicationConnectors(ArrayList<CanCommunicationConnector> value) {
        this.canCommunicationConnectors = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-COMMUNICATION-CONNECTOR")
    public ArrayList<EthernetCommunicationConnector> getEthernetCommunicationConnectors() {
        return this.ethernetCommunicationConnectors;
    }

    public void setEthernetCommunicationConnectors(ArrayList<EthernetCommunicationConnector> value) {
        this.ethernetCommunicationConnectors = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-COMMUNICATION-CONNECTOR")
    public ArrayList<FlexrayCommunicationConnector> getFlexrayCommunicationConnectors() {
        return this.flexrayCommunicationConnectors;
    }

    public void setFlexrayCommunicationConnectors(ArrayList<FlexrayCommunicationConnector> value) {
        this.flexrayCommunicationConnectors = value;
    }
    
    
    
    @XmlElement(name="LIN-COMMUNICATION-CONNECTOR")
    public ArrayList<LinCommunicationConnector> getLinCommunicationConnectors() {
        return this.linCommunicationConnectors;
    }

    public void setLinCommunicationConnectors(ArrayList<LinCommunicationConnector> value) {
        this.linCommunicationConnectors = value;
    }
    
    
    
    @XmlElement(name="TTCAN-COMMUNICATION-CONNECTOR")
    public ArrayList<TtcanCommunicationConnector> getTtcanCommunicationConnectors() {
        return this.ttcanCommunicationConnectors;
    }

    public void setTtcanCommunicationConnectors(ArrayList<TtcanCommunicationConnector> value) {
        this.ttcanCommunicationConnectors = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-COMMUNICATION-CONNECTOR")
    public ArrayList<UserDefinedCommunicationConnector> getUserDefinedCommunicationConnectors() {
        return this.userDefinedCommunicationConnectors;
    }

    public void setUserDefinedCommunicationConnectors(ArrayList<UserDefinedCommunicationConnector> value) {
        this.userDefinedCommunicationConnectors = value;
    }
    
    
}