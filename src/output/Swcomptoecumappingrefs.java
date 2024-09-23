package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swcomptoecumappingrefs {

    
    
    protected ArrayList<SwCompToEcuMappingRef> swCompToEcuMappingRefs;
    
    

    
    
    @XmlElement(name="SW-COMP-TO-ECU-MAPPING-REF")
    public ArrayList<SwCompToEcuMappingRef> getSwCompToEcuMappingRefs() {
        return this.swCompToEcuMappingRefs;
    }

    public void setSwCompToEcuMappingRefs(ArrayList<SwCompToEcuMappingRef> value) {
        this.swCompToEcuMappingRefs = value;
    }
    
    
}