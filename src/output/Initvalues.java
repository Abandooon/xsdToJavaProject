package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Initvalues {

    
    
    protected ArrayList<PortPrototypeBlueprintInitValue> portPrototypeBlueprintInitValues;
    
    

    
    
    @XmlElement(name="PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE")
    public ArrayList<PortPrototypeBlueprintInitValue> getPortPrototypeBlueprintInitValues() {
        return this.portPrototypeBlueprintInitValues;
    }

    public void setPortPrototypeBlueprintInitValues(ArrayList<PortPrototypeBlueprintInitValue> value) {
        this.portPrototypeBlueprintInitValues = value;
    }
    
    
}