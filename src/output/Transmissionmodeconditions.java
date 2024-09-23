package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transmissionmodeconditions {

    
    
    protected ArrayList<TransmissionModeCondition> transmissionModeConditions;
    
    

    
    
    @XmlElement(name="TRANSMISSION-MODE-CONDITION")
    public ArrayList<TransmissionModeCondition> getTransmissionModeConditions() {
        return this.transmissionModeConditions;
    }

    public void setTransmissionModeConditions(ArrayList<TransmissionModeCondition> value) {
        this.transmissionModeConditions = value;
    }
    
    
}