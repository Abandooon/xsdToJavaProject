package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ipdumappings {

    
    
    protected ArrayList<IPduMapping> iPduMappings;
    
    

    
    
    @XmlElement(name="I-PDU-MAPPING")
    public ArrayList<IPduMapping> getIPduMappings() {
        return this.iPduMappings;
    }

    public void setIPduMappings(ArrayList<IPduMapping> value) {
        this.iPduMappings = value;
    }
    
    
}