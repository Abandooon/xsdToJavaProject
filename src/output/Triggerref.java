package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Triggerref extends Ref {

    
    
    protected RteEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public RteEventSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(RteEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}