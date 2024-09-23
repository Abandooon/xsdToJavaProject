package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Applicationendpointref extends Ref {

    
    
    protected ApplicationEndpointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationEndpointSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ApplicationEndpointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}