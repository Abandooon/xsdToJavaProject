package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Predecessorfiforef extends Ref {

    
    
    protected CouplingPortFifoSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CouplingPortFifoSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CouplingPortFifoSubtypesEnum value) {
        this.dest = value;
    }
    
    
}