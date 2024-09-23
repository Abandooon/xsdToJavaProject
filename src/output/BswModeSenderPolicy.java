package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswModeSenderPolicy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BswModeSwitchAckRequest ackRequest;
    
    
    
    protected Boolean enhancedModeApi;
    
    
    
    protected ProvidedModeGroupRef providedModeGroupRef;
    
    
    
    protected PositiveInteger queueLength;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="ACK-REQUEST")
    public BswModeSwitchAckRequest getAckRequest() {
        return this.ackRequest;
    }

    public void setAckRequest(BswModeSwitchAckRequest value) {
        this.ackRequest = value;
    }
    
    
    
    @XmlElement(name="ENHANCED-MODE-API")
    public Boolean getEnhancedModeApi() {
        return this.enhancedModeApi;
    }

    public void setEnhancedModeApi(Boolean value) {
        this.enhancedModeApi = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-MODE-GROUP-REF")
    public ProvidedModeGroupRef getProvidedModeGroupRef() {
        return this.providedModeGroupRef;
    }

    public void setProvidedModeGroupRef(ProvidedModeGroupRef value) {
        this.providedModeGroupRef = value;
    }
    
    
    
    @XmlElement(name="QUEUE-LENGTH")
    public PositiveInteger getQueueLength() {
        return this.queueLength;
    }

    public void setQueueLength(PositiveInteger value) {
        this.queueLength = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}