package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Targetipduref extends Ref {

    
    
    protected PduTriggeringSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PduTriggeringSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PduTriggeringSubtypesEnum value) {
        this.dest = value;
    }
    
    
}