package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Contextrportref extends Ref {

    
    
    protected AbstractRequiredPortPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AbstractRequiredPortPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AbstractRequiredPortPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}