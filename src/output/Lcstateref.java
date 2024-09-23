package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Lcstateref extends Ref {

    
    
    protected LifeCycleStateSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LifeCycleStateSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(LifeCycleStateSubtypesEnum value) {
        this.dest = value;
    }
    
    
}