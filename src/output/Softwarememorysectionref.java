package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Softwarememorysectionref extends Ref {

    
    
    protected MemorySectionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public MemorySectionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(MemorySectionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}