package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignalipduref extends Ref {

    
    
    protected ISignalIPduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalIPduSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ISignalIPduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}