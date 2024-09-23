package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Directtpsduref extends Ref {

    
    
    protected IPduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public IPduSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(IPduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}