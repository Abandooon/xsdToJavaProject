package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Featureref extends Ref {

    
    
    protected FmFeatureSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FmFeatureSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FmFeatureSubtypesEnum value) {
        this.dest = value;
    }
    
    
}