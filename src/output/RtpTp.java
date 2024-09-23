package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RtpTp {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger ssrc;
    
    
    
    protected TcpUdpConfig tcpUdpConfig;
    
    

    
    
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
    
    
    
    @XmlElement(name="SSRC")
    public PositiveInteger getSsrc() {
        return this.ssrc;
    }

    public void setSsrc(PositiveInteger value) {
        this.ssrc = value;
    }
    
    
    
    @XmlElement(name="TCP-UDP-CONFIG")
    public TcpUdpConfig getTcpUdpConfig() {
        return this.tcpUdpConfig;
    }

    public void setTcpUdpConfig(TcpUdpConfig value) {
        this.tcpUdpConfig = value;
    }
    
    
}