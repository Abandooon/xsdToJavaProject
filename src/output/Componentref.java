package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Componentref extends Ref {

    
    
    protected SwComponentTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwComponentTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwComponentTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}