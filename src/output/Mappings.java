package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Mappings {

    
    
    protected ArrayList<SystemMapping> systemMappings;
    
    

    
    
    @XmlElement(name="SYSTEM-MAPPING")
    public ArrayList<SystemMapping> getSystemMappings() {
        return this.systemMappings;
    }

    public void setSystemMappings(ArrayList<SystemMapping> value) {
        this.systemMappings = value;
    }
    
    
}