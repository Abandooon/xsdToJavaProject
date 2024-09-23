package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Packageref extends Ref {

    
    
    protected ArPackageSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ArPackageSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ArPackageSubtypesEnum value) {
        this.dest = value;
    }
    
    
}