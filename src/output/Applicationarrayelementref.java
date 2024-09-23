package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Applicationarrayelementref extends Ref {

    
    
    protected ApplicationArrayElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationArrayElementSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ApplicationArrayElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}