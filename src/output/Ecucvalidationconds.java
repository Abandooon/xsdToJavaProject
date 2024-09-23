package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucvalidationconds {

    
    
    protected ArrayList<EcucValidationCondition> ecucValidationConditions;
    
    

    
    
    @XmlElement(name="ECUC-VALIDATION-CONDITION")
    public ArrayList<EcucValidationCondition> getEcucValidationConditions() {
        return this.ecucValidationConditions;
    }

    public void setEcucValidationConditions(ArrayList<EcucValidationCondition> value) {
        this.ecucValidationConditions = value;
    }
    
    
}