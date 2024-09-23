package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swaddrmethodref extends Ref {

    
    
    protected SwAddrMethodSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwAddrMethodSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwAddrMethodSubtypesEnum value) {
        this.dest = value;
    }
    
    
}