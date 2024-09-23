package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Mappedbswservicedependencyref extends Ref {

    
    
    protected BswServiceDependencyIdentSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswServiceDependencyIdentSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswServiceDependencyIdentSubtypesEnum value) {
        this.dest = value;
    }
    
    
}