package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwtyperef extends Ref {

    
    
    protected HwTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(HwTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}