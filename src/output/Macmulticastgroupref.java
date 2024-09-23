package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Macmulticastgroupref extends Ref {

    
    
    protected MacMulticastGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public MacMulticastGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(MacMulticastGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}