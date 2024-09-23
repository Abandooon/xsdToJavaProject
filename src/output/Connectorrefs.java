package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Connectorrefs {

    
    
    protected ArrayList<ConnectorRef> connectorRefs;
    
    

    
    
    @XmlElement(name="CONNECTOR-REF")
    public ArrayList<ConnectorRef> getConnectorRefs() {
        return this.connectorRefs;
    }

    public void setConnectorRefs(ArrayList<ConnectorRef> value) {
        this.connectorRefs = value;
    }
    
    
}