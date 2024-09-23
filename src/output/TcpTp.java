package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TcpTp {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TimeValue keepAliveInterval;
    
    
    
    protected PositiveInteger keepAliveProbesMax;
    
    
    
    protected TimeValue keepAliveTime;
    
    
    
    protected Boolean keepAlives;
    
    
    
    protected Boolean naglesAlgorithm;
    
    
    
    protected TpPort tcpTpPort;
    
    

    
    
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
    
    
    
    @XmlElement(name="KEEP-ALIVE-INTERVAL")
    public TimeValue getKeepAliveInterval() {
        return this.keepAliveInterval;
    }

    public void setKeepAliveInterval(TimeValue value) {
        this.keepAliveInterval = value;
    }
    
    
    
    @XmlElement(name="KEEP-ALIVE-PROBES-MAX")
    public PositiveInteger getKeepAliveProbesMax() {
        return this.keepAliveProbesMax;
    }

    public void setKeepAliveProbesMax(PositiveInteger value) {
        this.keepAliveProbesMax = value;
    }
    
    
    
    @XmlElement(name="KEEP-ALIVE-TIME")
    public TimeValue getKeepAliveTime() {
        return this.keepAliveTime;
    }

    public void setKeepAliveTime(TimeValue value) {
        this.keepAliveTime = value;
    }
    
    
    
    @XmlElement(name="KEEP-ALIVES")
    public Boolean getKeepAlives() {
        return this.keepAlives;
    }

    public void setKeepAlives(Boolean value) {
        this.keepAlives = value;
    }
    
    
    
    @XmlElement(name="NAGLES-ALGORITHM")
    public Boolean getNaglesAlgorithm() {
        return this.naglesAlgorithm;
    }

    public void setNaglesAlgorithm(Boolean value) {
        this.naglesAlgorithm = value;
    }
    
    
    
    @XmlElement(name="TCP-TP-PORT")
    public TpPort getTcpTpPort() {
        return this.tcpTpPort;
    }

    public void setTcpTpPort(TpPort value) {
        this.tcpTpPort = value;
    }
    
    
}