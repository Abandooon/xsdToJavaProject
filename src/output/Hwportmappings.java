package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwportmappings {

    
    
    protected ArrayList<HwPortMapping> hwPortMappings;
    
    

    
    
    @XmlElement(name="HW-PORT-MAPPING")
    public ArrayList<HwPortMapping> getHwPortMappings() {
        return this.hwPortMappings;
    }

    public void setHwPortMappings(ArrayList<HwPortMapping> value) {
        this.hwPortMappings = value;
    }
    
    
}