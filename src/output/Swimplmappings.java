package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swimplmappings {

    
    
    protected ArrayList<SwcToImplMapping> swcToImplMappings;
    
    

    
    
    @XmlElement(name="SWC-TO-IMPL-MAPPING")
    public ArrayList<SwcToImplMapping> getSwcToImplMappings() {
        return this.swcToImplMappings;
    }

    public void setSwcToImplMappings(ArrayList<SwcToImplMapping> value) {
        this.swcToImplMappings = value;
    }
    
    
}