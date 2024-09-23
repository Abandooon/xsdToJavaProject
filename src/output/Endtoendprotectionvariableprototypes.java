package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Endtoendprotectionvariableprototypes {

    
    
    protected ArrayList<EndToEndProtectionVariablePrototype> endToEndProtectionVariablePrototypes;
    
    

    
    
    @XmlElement(name="END-TO-END-PROTECTION-VARIABLE-PROTOTYPE")
    public ArrayList<EndToEndProtectionVariablePrototype> getEndToEndProtectionVariablePrototypes() {
        return this.endToEndProtectionVariablePrototypes;
    }

    public void setEndToEndProtectionVariablePrototypes(ArrayList<EndToEndProtectionVariablePrototype> value) {
        this.endToEndProtectionVariablePrototypes = value;
    }
    
    
}