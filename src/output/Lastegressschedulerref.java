package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Lastegressschedulerref extends Ref {

    
    
    protected CouplingPortSchedulerSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CouplingPortSchedulerSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CouplingPortSchedulerSubtypesEnum value) {
        this.dest = value;
    }
    
    
}