package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Referencevalueref extends Ref {

    
    
    protected DataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}