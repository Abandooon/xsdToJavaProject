package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Contextportprototyperef extends Ref {

    
    
    protected PortPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PortPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}