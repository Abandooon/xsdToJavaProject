package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Buildactionmanifestref extends Ref {

    
    
    protected BuildActionManifestSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BuildActionManifestSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BuildActionManifestSubtypesEnum value) {
        this.dest = value;
    }
    
    
}