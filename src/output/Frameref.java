package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Frameref extends Ref {

    
    
    protected FrameSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FrameSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FrameSubtypesEnum value) {
        this.dest = value;
    }
    
    
}