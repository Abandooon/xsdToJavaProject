package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Contextrootcompositionref extends Ref {

    
    
    protected RootSwCompositionPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public RootSwCompositionPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(RootSwCompositionPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}