package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Constantvaluemappingrefs {

    
    
    protected ArrayList<ConstantValueMappingRef> constantValueMappingRefs;
    
    

    
    
    @XmlElement(name="CONSTANT-VALUE-MAPPING-REF")
    public ArrayList<ConstantValueMappingRef> getConstantValueMappingRefs() {
        return this.constantValueMappingRefs;
    }

    public void setConstantValueMappingRefs(ArrayList<ConstantValueMappingRef> value) {
        this.constantValueMappingRefs = value;
    }
    
    
}