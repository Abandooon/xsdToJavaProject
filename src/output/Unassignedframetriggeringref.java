package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Unassignedframetriggeringref extends Ref {

    
    
    protected LinFrameTriggeringSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinFrameTriggeringSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(LinFrameTriggeringSubtypesEnum value) {
        this.dest = value;
    }
    
    
}