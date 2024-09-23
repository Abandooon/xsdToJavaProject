package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwattributedefref extends Ref {

    
    
    protected HwAttributeDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public HwAttributeDefSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(HwAttributeDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}