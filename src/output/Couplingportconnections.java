package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Couplingportconnections {

    
    
    protected ArrayList<CouplingPortConnection> couplingPortConnections;
    
    

    
    
    @XmlElement(name="COUPLING-PORT-CONNECTION")
    public ArrayList<CouplingPortConnection> getCouplingPortConnections() {
        return this.couplingPortConnections;
    }

    public void setCouplingPortConnections(ArrayList<CouplingPortConnection> value) {
        this.couplingPortConnections = value;
    }
    
    
}