package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignalgroupref extends Ref {

    
    
    protected ISignalGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ISignalGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}