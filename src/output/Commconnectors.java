package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Commconnectors {

    
    
    protected ArrayList<CommunicationConnectorRefConditional> communicationConnectorRefConditionals;
    
    

    
    
    @XmlElement(name="COMMUNICATION-CONNECTOR-REF-CONDITIONAL")
    public ArrayList<CommunicationConnectorRefConditional> getCommunicationConnectorRefConditionals() {
        return this.communicationConnectorRefConditionals;
    }

    public void setCommunicationConnectorRefConditionals(ArrayList<CommunicationConnectorRefConditional> value) {
        this.communicationConnectorRefConditionals = value;
    }
    
    
}