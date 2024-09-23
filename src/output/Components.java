package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Components {

    
    
    protected ArrayList<SwComponentPrototype> swComponentPrototypes;
    
    

    
    
    @XmlElement(name="SW-COMPONENT-PROTOTYPE")
    public ArrayList<SwComponentPrototype> getSwComponentPrototypes() {
        return this.swComponentPrototypes;
    }

    public void setSwComponentPrototypes(ArrayList<SwComponentPrototype> value) {
        this.swComponentPrototypes = value;
    }
    
    
}