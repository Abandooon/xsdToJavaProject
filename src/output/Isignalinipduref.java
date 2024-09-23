package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignalinipduref extends Ref {

    
    
    protected ISignalToIPduMappingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalToIPduMappingSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ISignalToIPduMappingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}