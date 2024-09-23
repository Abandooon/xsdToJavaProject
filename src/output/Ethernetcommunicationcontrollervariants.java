package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ethernetcommunicationcontrollervariants {

    
    
    protected ArrayList<EthernetCommunicationControllerConditional> ethernetCommunicationControllerConditionals;
    
    

    
    
    @XmlElement(name="ETHERNET-COMMUNICATION-CONTROLLER-CONDITIONAL")
    public ArrayList<EthernetCommunicationControllerConditional> getEthernetCommunicationControllerConditionals() {
        return this.ethernetCommunicationControllerConditionals;
    }

    public void setEthernetCommunicationControllerConditionals(ArrayList<EthernetCommunicationControllerConditional> value) {
        this.ethernetCommunicationControllerConditionals = value;
    }
    
    
}