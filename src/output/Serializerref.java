package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Serializerref extends Ref {

    
    
    protected SerializationTechnologySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SerializationTechnologySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SerializationTechnologySubtypesEnum value) {
        this.dest = value;
    }
    
    
}