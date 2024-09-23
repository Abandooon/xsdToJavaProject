package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Destinationref extends Ref {

    
    
    protected EcucContainerDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucContainerDefSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcucContainerDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}