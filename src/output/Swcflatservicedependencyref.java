package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swcflatservicedependencyref extends Ref {

    
    
    protected SwcServiceDependencySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcServiceDependencySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwcServiceDependencySubtypesEnum value) {
        this.dest = value;
    }
    
    
}