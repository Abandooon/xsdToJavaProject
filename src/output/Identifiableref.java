package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Identifiableref extends Ref {

    
    
    protected IdentifiableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public IdentifiableSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(IdentifiableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}