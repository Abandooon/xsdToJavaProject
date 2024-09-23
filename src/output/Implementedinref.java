package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Implementedinref extends Ref {

    
    
    protected DependencyOnArtifactSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DependencyOnArtifactSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DependencyOnArtifactSubtypesEnum value) {
        this.dest = value;
    }
    
    
}