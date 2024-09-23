package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Connectionbundles {

    
    
    protected ArrayList<SocketConnectionBundle> socketConnectionBundles;
    
    

    
    
    @XmlElement(name="SOCKET-CONNECTION-BUNDLE")
    public ArrayList<SocketConnectionBundle> getSocketConnectionBundles() {
        return this.socketConnectionBundles;
    }

    public void setSocketConnectionBundles(ArrayList<SocketConnectionBundle> value) {
        this.socketConnectionBundles = value;
    }
    
    
}