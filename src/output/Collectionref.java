package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Collectionref extends Ref {

    
    
    protected CollectionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CollectionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CollectionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}