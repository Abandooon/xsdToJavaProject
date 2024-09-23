package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bswinternaltriggeringpointref extends Ref {

    
    
    protected BswInternalTriggeringPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswInternalTriggeringPointSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswInternalTriggeringPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}