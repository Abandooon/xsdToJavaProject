package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Asynchronousservercallpointref extends Ref {

    
    
    protected BswAsynchronousServerCallPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswAsynchronousServerCallPointSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswAsynchronousServerCallPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}