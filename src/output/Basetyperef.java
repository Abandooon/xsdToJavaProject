package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Basetyperef extends Ref {

    
    
    protected SwBaseTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwBaseTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwBaseTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}