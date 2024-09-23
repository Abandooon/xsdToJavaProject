package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Offsettimedomainref extends Ref {

    
    
    protected GlobalTimeDomainSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public GlobalTimeDomainSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(GlobalTimeDomainSubtypesEnum value) {
        this.dest = value;
    }
    
    
}