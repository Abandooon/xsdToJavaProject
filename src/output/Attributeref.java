package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Attributeref extends Ref {

    
    
    protected FmAttributeDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FmAttributeDefSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FmAttributeDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}