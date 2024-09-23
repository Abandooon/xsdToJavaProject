package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Userdefinedcommunicationcontrollervariants {

    
    
    protected ArrayList<UserDefinedCommunicationControllerConditional> userDefinedCommunicationControllerConditionals;
    
    

    
    
    @XmlElement(name="USER-DEFINED-COMMUNICATION-CONTROLLER-CONDITIONAL")
    public ArrayList<UserDefinedCommunicationControllerConditional> getUserDefinedCommunicationControllerConditionals() {
        return this.userDefinedCommunicationControllerConditionals;
    }

    public void setUserDefinedCommunicationControllerConditionals(ArrayList<UserDefinedCommunicationControllerConditional> value) {
        this.userDefinedCommunicationControllerConditionals = value;
    }
    
    
}