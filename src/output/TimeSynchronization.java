package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TimeSynchronization {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TimeSyncClientConfiguration timeSyncClient;
    
    
    
    protected TimeSyncServerConfiguration timeSyncServer;
    
    

    
    
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
    
    
    
    @XmlElement(name="TIME-SYNC-CLIENT")
    public TimeSyncClientConfiguration getTimeSyncClient() {
        return this.timeSyncClient;
    }

    public void setTimeSyncClient(TimeSyncClientConfiguration value) {
        this.timeSyncClient = value;
    }
    
    
    
    @XmlElement(name="TIME-SYNC-SERVER")
    public TimeSyncServerConfiguration getTimeSyncServer() {
        return this.timeSyncServer;
    }

    public void setTimeSyncServer(TimeSyncServerConfiguration value) {
        this.timeSyncServer = value;
    }
    
    
}