package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pduref extends Ref {

    
    
    protected PduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PduSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}