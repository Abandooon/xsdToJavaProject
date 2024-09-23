package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ttcancommunicationcontrollervariants {

    
    
    protected ArrayList<TtcanCommunicationControllerConditional> ttcanCommunicationControllerConditionals;
    
    

    
    
    @XmlElement(name="TTCAN-COMMUNICATION-CONTROLLER-CONDITIONAL")
    public ArrayList<TtcanCommunicationControllerConditional> getTtcanCommunicationControllerConditionals() {
        return this.ttcanCommunicationControllerConditionals;
    }

    public void setTtcanCommunicationControllerConditionals(ArrayList<TtcanCommunicationControllerConditional> value) {
        this.ttcanCommunicationControllerConditionals = value;
    }
    
    
}