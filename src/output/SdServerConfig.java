package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SdServerConfig {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CapabilityRecords capabilityRecords;
    
    
    
    protected InitialSdDelayConfig initialOfferBehavior;
    
    
    
    protected TimeValue offerCyclicDelay;
    
    
    
    protected RequestResponseDelay requestResponseDelay;
    
    
    
    protected PositiveInteger serverServiceMajorVersion;
    
    
    
    protected PositiveInteger serverServiceMinorVersion;
    
    
    
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
    
    
    
    @XmlElement(name="INITIAL-OFFER-BEHAVIOR")
    public InitialSdDelayConfig getInitialOfferBehavior() {
        return this.initialOfferBehavior;
    }

    public void setInitialOfferBehavior(InitialSdDelayConfig value) {
        this.initialOfferBehavior = value;
    }
    
    
    
    @XmlElement(name="OFFER-CYCLIC-DELAY")
    public TimeValue getOfferCyclicDelay() {
        return this.offerCyclicDelay;
    }

    public void setOfferCyclicDelay(TimeValue value) {
        this.offerCyclicDelay = value;
    }
    
    
    
    @XmlElement(name="REQUEST-RESPONSE-DELAY")
    public RequestResponseDelay getRequestResponseDelay() {
        return this.requestResponseDelay;
    }

    public void setRequestResponseDelay(RequestResponseDelay value) {
        this.requestResponseDelay = value;
    }
    
    
    
    @XmlElement(name="SERVER-SERVICE-MAJOR-VERSION")
    public PositiveInteger getServerServiceMajorVersion() {
        return this.serverServiceMajorVersion;
    }

    public void setServerServiceMajorVersion(PositiveInteger value) {
        this.serverServiceMajorVersion = value;
    }
    
    
    
    @XmlElement(name="SERVER-SERVICE-MINOR-VERSION")
    public PositiveInteger getServerServiceMinorVersion() {
        return this.serverServiceMinorVersion;
    }

    public void setServerServiceMinorVersion(PositiveInteger value) {
        this.serverServiceMinorVersion = value;
    }
    
    
    
    @XmlElement(name="TTL")
    public PositiveInteger getTtl() {
        return this.ttl;
    }

    public void setTtl(PositiveInteger value) {
        this.ttl = value;
    }
    
    
}