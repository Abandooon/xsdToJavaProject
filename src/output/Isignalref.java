package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignalref extends Ref {

    
    
    protected ISignalSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ISignalSubtypesEnum value) {
        this.dest = value;
    }
    
    
}