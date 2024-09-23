package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Targetrunnableentityref extends Ref {

    
    
    protected RunnableEntitySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public RunnableEntitySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(RunnableEntitySubtypesEnum value) {
        this.dest = value;
    }
    
    
}