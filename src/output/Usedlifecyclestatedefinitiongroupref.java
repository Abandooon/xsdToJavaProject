package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Usedlifecyclestatedefinitiongroupref extends Ref {

    
    
    protected LifeCycleStateDefinitionGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LifeCycleStateDefinitionGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(LifeCycleStateDefinitionGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}