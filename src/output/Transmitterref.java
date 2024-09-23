package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transmitterref extends Ref {

    
    
    protected LinTpNodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinTpNodeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(LinTpNodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}