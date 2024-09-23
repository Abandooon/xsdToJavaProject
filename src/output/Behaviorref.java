package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Behaviorref extends Ref {

    
    
    protected SwcInternalBehaviorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcInternalBehaviorSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwcInternalBehaviorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}