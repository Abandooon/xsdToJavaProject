package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nmifecuref extends Ref {

    
    
    protected NmEcuSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NmEcuSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(NmEcuSubtypesEnum value) {
        this.dest = value;
    }
    
    
}