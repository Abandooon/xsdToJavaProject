package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Portprototypeblueprintref extends Ref {

    
    
    protected PortPrototypeBlueprintSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortPrototypeBlueprintSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PortPrototypeBlueprintSubtypesEnum value) {
        this.dest = value;
    }
    
    
}