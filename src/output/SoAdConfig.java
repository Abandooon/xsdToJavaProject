package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SoAdConfig {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Connections connections;
    
    
    
    protected ConnectionBundles connectionBundles;
    
    
    
    protected LogicAddresss logicAddresss;
    
    
    
    protected SocketAddresss socketAddresss;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
        return this.s;
    }

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
        return this.t;
    }

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="CONNECTIONS")
    public Connections getConnections() {
        return this.connections;
    }

    public void setConnections(Connections value) {
        this.connections = value;
    }
    
    
    
    @XmlElement(name="CONNECTION-BUNDLES")
    public ConnectionBundles getConnectionBundles() {
        return this.connectionBundles;
    }

    public void setConnectionBundles(ConnectionBundles value) {
        this.connectionBundles = value;
    }
    
    
    
    @XmlElement(name="LOGIC-ADDRESSS")
    public LogicAddresss getLogicAddresss() {
        return this.logicAddresss;
    }

    public void setLogicAddresss(LogicAddresss value) {
        this.logicAddresss = value;
    }
    
    
    
    @XmlElement(name="SOCKET-ADDRESSS")
    public SocketAddresss getSocketAddresss() {
        return this.socketAddresss;
    }

    public void setSocketAddresss(SocketAddresss value) {
        this.socketAddresss = value;
    }
    
    
}