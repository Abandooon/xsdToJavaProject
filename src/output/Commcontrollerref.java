package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Commcontrollerref extends Ref {

    
    
    protected CommunicationControllerSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CommunicationControllerSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CommunicationControllerSubtypesEnum value) {
        this.dest = value;
    }
    
    
}