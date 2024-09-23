package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Targetrunnableentitygroupref extends Ref {

    
    
    protected RunnableEntityGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public RunnableEntityGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(RunnableEntityGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}