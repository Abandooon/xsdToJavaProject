package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Subcontainers {

    
    
    protected ArrayList<EcucContainerValue> ecucContainerValues;
    
    

    
    
    @XmlElement(name="ECUC-CONTAINER-VALUE")
    public ArrayList<EcucContainerValue> getEcucContainerValues() {
        return this.ecucContainerValues;
    }

    public void setEcucContainerValues(ArrayList<EcucContainerValue> value) {
        this.ecucContainerValues = value;
    }
    
    
}