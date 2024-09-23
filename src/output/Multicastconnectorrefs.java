package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Multicastconnectorrefs {

    
    
    protected ArrayList<MulticastConnectorRef> multicastConnectorRefs;
    
    

    
    
    @XmlElement(name="MULTICAST-CONNECTOR-REF")
    public ArrayList<MulticastConnectorRef> getMulticastConnectorRefs() {
        return this.multicastConnectorRefs;
    }

    public void setMulticastConnectorRefs(ArrayList<MulticastConnectorRef> value) {
        this.multicastConnectorRefs = value;
    }
    
    
}