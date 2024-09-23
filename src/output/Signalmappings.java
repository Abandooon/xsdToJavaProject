package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Signalmappings {

    
    
    protected ArrayList<ISignalMapping> iSignalMappings;
    
    

    
    
    @XmlElement(name="I-SIGNAL-MAPPING")
    public ArrayList<ISignalMapping> getISignalMappings() {
        return this.iSignalMappings;
    }

    public void setISignalMappings(ArrayList<ISignalMapping> value) {
        this.iSignalMappings = value;
    }
    
    
}