package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Socketaddresss {

    
    
    protected ArrayList<SocketAddress> socketAddresss;
    
    

    
    
    @XmlElement(name="SOCKET-ADDRESS")
    public ArrayList<SocketAddress> getSocketAddresss() {
        return this.socketAddresss;
    }

    public void setSocketAddresss(ArrayList<SocketAddress> value) {
        this.socketAddresss = value;
    }
    
    
}