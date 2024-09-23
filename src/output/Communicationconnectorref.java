package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Communicationconnectorref extends Ref {

    
    
    protected CommunicationConnectorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CommunicationConnectorSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CommunicationConnectorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}