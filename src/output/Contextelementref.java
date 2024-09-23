package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Contextelementref extends Ref {

    
    
    protected AtpFeatureSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AtpFeatureSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AtpFeatureSubtypesEnum value) {
        this.dest = value;
    }
    
    
}