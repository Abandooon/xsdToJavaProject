package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Cancommunicationcontrollervariants {

    
    
    protected ArrayList<CanCommunicationControllerConditional> canCommunicationControllerConditionals;
    
    

    
    
    @XmlElement(name="CAN-COMMUNICATION-CONTROLLER-CONDITIONAL")
    public ArrayList<CanCommunicationControllerConditional> getCanCommunicationControllerConditionals() {
        return this.canCommunicationControllerConditionals;
    }

    public void setCanCommunicationControllerConditionals(ArrayList<CanCommunicationControllerConditional> value) {
        this.canCommunicationControllerConditionals = value;
    }
    
    
}