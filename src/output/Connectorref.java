package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Connectorref extends Ref {

    
    
    protected EthernetCommunicationConnectorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EthernetCommunicationConnectorSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EthernetCommunicationConnectorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}