package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Networkendpointref extends Ref {

    
    
    protected NetworkEndpointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NetworkEndpointSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(NetworkEndpointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}