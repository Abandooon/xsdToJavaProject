package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwcommunicationportref extends Ref {

    
    
    protected HwPinGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwPinGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(HwPinGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}