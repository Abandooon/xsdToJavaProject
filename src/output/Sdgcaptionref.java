package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sdgcaptionref extends Ref {

    
    
    protected SdgCaptionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SdgCaptionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SdgCaptionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}