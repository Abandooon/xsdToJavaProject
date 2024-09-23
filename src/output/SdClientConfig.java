package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SdClientConfig {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CapabilityRecords capabilityRecords;
    
    
    
    protected PositiveInteger clientServiceMajorVersion;
    
    
    
    protected PositiveInteger clientServiceMinorVersion;
    
    
    
    protected InitialSdDelayConfig initialFindBehavior;
    
    
    
    protected RequestResponseDelay requestResponseDelay;
    
    
    
    protected PositiveInteger ttl;
    
    

    
    
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
    
    
    
    @XmlElement(name="CAPABILITY-RECORDS")
    public CapabilityRecords getCapabilityRecords() {
        return this.capabilityRecords;
    }

    public void setCapabilityRecords(CapabilityRecords value) {
        this.capabilityRecords = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVICE-MAJOR-VERSION")
    public PositiveInteger getClientServiceMajorVersion() {
        return this.clientServiceMajorVersion;
    }

    public void setClientServiceMajorVersion(PositiveInteger value) {
        this.clientServiceMajorVersion = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVICE-MINOR-VERSION")
    public PositiveInteger getClientServiceMinorVersion() {
        return this.clientServiceMinorVersion;
    }

    public void setClientServiceMinorVersion(PositiveInteger value) {
        this.clientServiceMinorVersion = value;
    }
    
    
    
    @XmlElement(name="INITIAL-FIND-BEHAVIOR")
    public InitialSdDelayConfig getInitialFindBehavior() {
        return this.initialFindBehavior;
    }

    public void setInitialFindBehavior(InitialSdDelayConfig value) {
        this.initialFindBehavior = value;
    }
    
    
    
    @XmlElement(name="REQUEST-RESPONSE-DELAY")
    public RequestResponseDelay getRequestResponseDelay() {
        return this.requestResponseDelay;
    }

    public void setRequestResponseDelay(RequestResponseDelay value) {
        this.requestResponseDelay = value;
    }
    
    
    
    @XmlElement(name="TTL")
    public PositiveInteger getTtl() {
        return this.ttl;
    }

    public void setTtl(PositiveInteger value) {
        this.ttl = value;
    }
    
    
}