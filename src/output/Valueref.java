package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Valueref extends Ref {

    
    
    protected ReferrableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ReferrableSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ReferrableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}