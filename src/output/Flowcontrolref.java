package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Flowcontrolref extends Ref {

    
    
    protected NPduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NPduSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(NPduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}