package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Referencedtdeventvfbref extends Ref {

    
    
    protected TdEventVfbSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TdEventVfbSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TdEventVfbSubtypesEnum value) {
        this.dest = value;
    }
    
    
}