package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Targetref extends Ref {

    
    
    protected PortGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PortGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}