package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Providedouterportref extends Ref {

    
    
    protected AbstractProvidedPortPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AbstractProvidedPortPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AbstractProvidedPortPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}