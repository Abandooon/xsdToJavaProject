package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Destinationuriref extends Ref {

    
    
    protected EcucDestinationUriDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucDestinationUriDefSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcucDestinationUriDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}