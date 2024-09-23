package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Rootargumentdataprototyperef extends Ref {

    
    
    protected ArgumentDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ArgumentDataPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ArgumentDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}