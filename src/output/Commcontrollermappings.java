package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Commcontrollermappings {

    
    
    protected ArrayList<CommunicationControllerMapping> communicationControllerMappings;
    
    

    
    
    @XmlElement(name="COMMUNICATION-CONTROLLER-MAPPING")
    public ArrayList<CommunicationControllerMapping> getCommunicationControllerMappings() {
        return this.communicationControllerMappings;
    }

    public void setCommunicationControllerMappings(ArrayList<CommunicationControllerMapping> value) {
        this.communicationControllerMappings = value;
    }
    
    
}