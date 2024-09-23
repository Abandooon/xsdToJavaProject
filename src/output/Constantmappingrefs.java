package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Constantmappingrefs {

    
    
    protected ArrayList<ConstantMappingRef> constantMappingRefs;
    
    

    
    
    @XmlElement(name="CONSTANT-MAPPING-REF")
    public ArrayList<ConstantMappingRef> getConstantMappingRefs() {
        return this.constantMappingRefs;
    }

    public void setConstantMappingRefs(ArrayList<ConstantMappingRef> value) {
        this.constantMappingRefs = value;
    }
    
    
}