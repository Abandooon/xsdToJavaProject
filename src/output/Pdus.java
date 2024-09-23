package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pdus {

    
    
    protected ArrayList<SocketConnectionIpduIdentifier> socketConnectionIpduIdentifiers;
    
    

    
    
    @XmlElement(name="SOCKET-CONNECTION-IPDU-IDENTIFIER")
    public ArrayList<SocketConnectionIpduIdentifier> getSocketConnectionIpduIdentifiers() {
        return this.socketConnectionIpduIdentifiers;
    }

    public void setSocketConnectionIpduIdentifiers(ArrayList<SocketConnectionIpduIdentifier> value) {
        this.socketConnectionIpduIdentifiers = value;
    }
    
    
}