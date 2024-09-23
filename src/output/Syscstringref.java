package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Syscstringref extends Ref {

    
    
    protected SwSystemconstSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwSystemconstSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwSystemconstSubtypesEnum value) {
        this.dest = value;
    }
    
    
}