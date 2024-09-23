package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Rptsystemref extends Ref {

    
    
    protected SystemSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SystemSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SystemSubtypesEnum value) {
        this.dest = value;
    }
    
    
}