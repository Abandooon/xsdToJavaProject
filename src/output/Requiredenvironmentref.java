package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Requiredenvironmentref extends Ref {

    
    
    protected BuildActionEnvironmentSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BuildActionEnvironmentSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BuildActionEnvironmentSubtypesEnum value) {
        this.dest = value;
    }
    
    
}