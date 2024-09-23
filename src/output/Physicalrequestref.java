package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Physicalrequestref extends Ref {

    
    
    protected TpConnectionIdentSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TpConnectionIdentSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TpConnectionIdentSubtypesEnum value) {
        this.dest = value;
    }
    
    
}