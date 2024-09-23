package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sourceframeref extends Ref {

    
    
    protected FrameTriggeringSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FrameTriggeringSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FrameTriggeringSubtypesEnum value) {
        this.dest = value;
    }
    
    
}