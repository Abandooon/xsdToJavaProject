package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Moduledescriptionref extends Ref {

    
    
    protected BswImplementationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswImplementationSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswImplementationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}