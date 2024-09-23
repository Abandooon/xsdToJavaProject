package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Derivedobjectref extends Ref {

    
    
    protected AtpBlueprintableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AtpBlueprintableSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AtpBlueprintableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}