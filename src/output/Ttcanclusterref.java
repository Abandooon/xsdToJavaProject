package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ttcanclusterref extends Ref {

    
    
    protected TtcanClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TtcanClusterSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TtcanClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}