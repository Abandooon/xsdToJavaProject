package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swaxistyperef extends Ref {

    
    
    protected SwAxisTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwAxisTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwAxisTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}