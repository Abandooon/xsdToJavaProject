package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Usedpimref extends Ref {

    
    
    protected PerInstanceMemorySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PerInstanceMemorySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PerInstanceMemorySubtypesEnum value) {
        this.dest = value;
    }
    
    
}