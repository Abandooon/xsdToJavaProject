package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Connections {

    
    
    protected ArrayList<SocketConnection> socketConnections;
    
    

    
    
    @XmlElement(name="SOCKET-CONNECTION")
    public ArrayList<SocketConnection> getSocketConnections() {
        return this.socketConnections;
    }

    public void setSocketConnections(ArrayList<SocketConnection> value) {
        this.socketConnections = value;
    }
    
    
}