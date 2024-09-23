package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Timingeventref extends Ref {

    
    
    protected TimingEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TimingEventSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TimingEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}