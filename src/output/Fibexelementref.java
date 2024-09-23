package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Fibexelementref extends Ref {

    
    
    protected FibexElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FibexElementSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FibexElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}