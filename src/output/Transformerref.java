package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transformerref extends Ref {

    
    
    protected TransformationTechnologySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TransformationTechnologySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TransformationTechnologySubtypesEnum value) {
        this.dest = value;
    }
    
    
}