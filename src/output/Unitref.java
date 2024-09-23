package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Unitref extends Ref {

    
    
    protected UnitSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public UnitSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(UnitSubtypesEnum value) {
        this.dest = value;
    }
    
    
}