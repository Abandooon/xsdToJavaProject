package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Accessedvariableref extends Ref {

    
    
    protected VariableDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public VariableDataPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(VariableDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}