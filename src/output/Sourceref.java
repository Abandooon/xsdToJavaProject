package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sourceref extends Ref {

    
    
    protected TimingDescriptionEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TimingDescriptionEventSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TimingDescriptionEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}