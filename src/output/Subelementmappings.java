package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Subelementmappings {

    
    
    protected ArrayList<SubElementMapping> subElementMappings;
    
    

    
    
    @XmlElement(name="SUB-ELEMENT-MAPPING")
    public ArrayList<SubElementMapping> getSubElementMappings() {
        return this.subElementMappings;
    }

    public void setSubElementMappings(ArrayList<SubElementMapping> value) {
        this.subElementMappings = value;
    }
    
    
}