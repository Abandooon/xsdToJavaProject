package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Schedulernameprefixref extends Ref {

    
    
    protected BswSchedulerNamePrefixSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswSchedulerNamePrefixSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswSchedulerNamePrefixSubtypesEnum value) {
        this.dest = value;
    }
    
    
}