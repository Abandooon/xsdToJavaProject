package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Frclusterref extends Ref {

    
    
    protected FlexrayClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayClusterSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FlexrayClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}