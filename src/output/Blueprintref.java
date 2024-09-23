package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Blueprintref extends Ref {

    
    
    protected AtpBlueprintSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AtpBlueprintSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AtpBlueprintSubtypesEnum value) {
        this.dest = value;
    }
    
    
}