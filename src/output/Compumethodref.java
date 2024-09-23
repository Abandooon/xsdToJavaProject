package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Compumethodref extends Ref {

    
    
    protected CompuMethodSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CompuMethodSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CompuMethodSubtypesEnum value) {
        this.dest = value;
    }
    
    
}