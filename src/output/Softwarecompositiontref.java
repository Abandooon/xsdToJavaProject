package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Softwarecompositiontref extends Ref {

    
    
    protected CompositionSwComponentTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CompositionSwComponentTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CompositionSwComponentTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}