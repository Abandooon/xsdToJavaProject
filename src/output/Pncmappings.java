package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pncmappings {

    
    
    protected ArrayList<PncMapping> pncMappings;
    
    

    
    
    @XmlElement(name="PNC-MAPPING")
    public ArrayList<PncMapping> getPncMappings() {
        return this.pncMappings;
    }

    public void setPncMappings(ArrayList<PncMapping> value) {
        this.pncMappings = value;
    }
    
    
}