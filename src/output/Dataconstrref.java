package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dataconstrref extends Ref {

    
    
    protected DataConstrSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataConstrSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DataConstrSubtypesEnum value) {
        this.dest = value;
    }
    
    
}