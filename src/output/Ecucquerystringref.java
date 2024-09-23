package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucquerystringref extends Ref {

    
    
    protected EcucQuerySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucQuerySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcucQuerySubtypesEnum value) {
        this.dest = value;
    }
    
    
}