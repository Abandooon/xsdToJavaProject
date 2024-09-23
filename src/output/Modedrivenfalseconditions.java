package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modedrivenfalseconditions {

    
    
    protected ArrayList<ModeDrivenTransmissionModeCondition> modeDrivenTransmissionModeConditions;
    
    

    
    
    @XmlElement(name="MODE-DRIVEN-TRANSMISSION-MODE-CONDITION")
    public ArrayList<ModeDrivenTransmissionModeCondition> getModeDrivenTransmissionModeConditions() {
        return this.modeDrivenTransmissionModeConditions;
    }

    public void setModeDrivenTransmissionModeConditions(ArrayList<ModeDrivenTransmissionModeCondition> value) {
        this.modeDrivenTransmissionModeConditions = value;
    }
    
    
}