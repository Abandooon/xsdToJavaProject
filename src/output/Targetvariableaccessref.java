package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Targetvariableaccessref extends Ref {

    
    
    protected VariableAccessSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public VariableAccessSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(VariableAccessSubtypesEnum value) {
        this.dest = value;
    }
    
    
}