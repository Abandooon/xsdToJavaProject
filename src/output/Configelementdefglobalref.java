package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Configelementdefglobalref extends Ref {

    
    
    protected EcucDefinitionElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucDefinitionElementSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcucDefinitionElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}