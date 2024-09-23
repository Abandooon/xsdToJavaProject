package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Implementationarrayelementref extends Ref {

    
    
    protected ImplementationDataTypeElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ImplementationDataTypeElementSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ImplementationDataTypeElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}