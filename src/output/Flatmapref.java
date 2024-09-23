package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Flatmapref extends Ref {

    
    
    protected FlatMapSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlatMapSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FlatMapSubtypesEnum value) {
        this.dest = value;
    }
    
    
}