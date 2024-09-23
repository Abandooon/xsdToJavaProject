package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Physicaldimensionmappings {

    
    
    protected ArrayList<PhysicalDimensionMapping> physicalDimensionMappings;
    
    

    
    
    @XmlElement(name="PHYSICAL-DIMENSION-MAPPING")
    public ArrayList<PhysicalDimensionMapping> getPhysicalDimensionMappings() {
        return this.physicalDimensionMappings;
    }

    public void setPhysicalDimensionMappings(ArrayList<PhysicalDimensionMapping> value) {
        this.physicalDimensionMappings = value;
    }
    
    
}