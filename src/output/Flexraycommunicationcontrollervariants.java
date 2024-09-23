package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Flexraycommunicationcontrollervariants {

    
    
    protected ArrayList<FlexrayCommunicationControllerConditional> flexrayCommunicationControllerConditionals;
    
    

    
    
    @XmlElement(name="FLEXRAY-COMMUNICATION-CONTROLLER-CONDITIONAL")
    public ArrayList<FlexrayCommunicationControllerConditional> getFlexrayCommunicationControllerConditionals() {
        return this.flexrayCommunicationControllerConditionals;
    }

    public void setFlexrayCommunicationControllerConditionals(ArrayList<FlexrayCommunicationControllerConditional> value) {
        this.flexrayCommunicationControllerConditionals = value;
    }
    
    
}