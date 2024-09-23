package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Secondapplicationerrorref extends Ref {

    
    
    protected ApplicationErrorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationErrorSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ApplicationErrorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}