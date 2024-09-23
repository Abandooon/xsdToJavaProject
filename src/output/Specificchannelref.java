package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Specificchannelref extends Ref {

    
    
    protected CommunicationClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CommunicationClusterSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CommunicationClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}