package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpconnections {

    
    
    protected ArrayList<LinTpConnection> linTpConnections;
    
    

    
    
    @XmlElement(name="LIN-TP-CONNECTION")
    public ArrayList<LinTpConnection> getLinTpConnections() {
        return this.linTpConnections;
    }

    public void setLinTpConnections(ArrayList<LinTpConnection> value) {
        this.linTpConnections = value;
    }
    
    
}