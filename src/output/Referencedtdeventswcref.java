package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Referencedtdeventswcref extends Ref {

    
    
    protected TdEventSwcSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TdEventSwcSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TdEventSwcSubtypesEnum value) {
        this.dest = value;
    }
    
    
}