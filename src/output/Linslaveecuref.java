package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linslaveecuref extends Ref {

    
    
    protected LinSlaveSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinSlaveSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(LinSlaveSubtypesEnum value) {
        this.dest = value;
    }
    
    
}