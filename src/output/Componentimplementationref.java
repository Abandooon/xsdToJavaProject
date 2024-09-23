package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Componentimplementationref extends Ref {

    
    
    protected SwcImplementationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcImplementationSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwcImplementationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}