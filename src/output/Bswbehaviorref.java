package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bswbehaviorref extends Ref {

    
    
    protected BswInternalBehaviorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswInternalBehaviorSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswInternalBehaviorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}