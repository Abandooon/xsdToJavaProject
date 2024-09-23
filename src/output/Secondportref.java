package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Secondportref extends Ref {

    
    
    protected CouplingPortSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CouplingPortSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CouplingPortSubtypesEnum value) {
        this.dest = value;
    }
    
    
}