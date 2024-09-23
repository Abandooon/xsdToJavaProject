package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Implementationdatatyperef extends Ref {

    
    
    protected ImplementationDataTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ImplementationDataTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ImplementationDataTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}