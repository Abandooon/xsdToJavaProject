package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecuresourcemappings {

    
    
    protected ArrayList<EcuMapping> ecuMappings;
    
    

    
    
    @XmlElement(name="ECU-MAPPING")
    public ArrayList<EcuMapping> getEcuMappings() {
        return this.ecuMappings;
    }

    public void setEcuMappings(ArrayList<EcuMapping> value) {
        this.ecuMappings = value;
    }
    
    
}