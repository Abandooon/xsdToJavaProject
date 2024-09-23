package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swmappings {

    
    
    protected ArrayList<SwcToEcuMapping> swcToEcuMappings;
    
    

    
    
    @XmlElement(name="SWC-TO-ECU-MAPPING")
    public ArrayList<SwcToEcuMapping> getSwcToEcuMappings() {
        return this.swcToEcuMappings;
    }

    public void setSwcToEcuMappings(ArrayList<SwcToEcuMapping> value) {
        this.swcToEcuMappings = value;
    }
    
    
}