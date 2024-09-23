package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Secondphysicaldimensionref extends Ref {

    
    
    protected PhysicalDimensionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PhysicalDimensionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PhysicalDimensionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}