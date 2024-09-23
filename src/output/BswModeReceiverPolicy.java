package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswModeReceiverPolicy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean enhancedModeApi;
    
    
    
    protected RequiredModeGroupRef requiredModeGroupRef;
    
    
    
    protected Boolean supportsAsynchronousModeSwitch;
    
    
    
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
    
    
    
    @XmlElement(name="ENHANCED-MODE-API")
    public Boolean getEnhancedModeApi() {
        return this.enhancedModeApi;
    }

    public void setEnhancedModeApi(Boolean value) {
        this.enhancedModeApi = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-MODE-GROUP-REF")
    public RequiredModeGroupRef getRequiredModeGroupRef() {
        return this.requiredModeGroupRef;
    }

    public void setRequiredModeGroupRef(RequiredModeGroupRef value) {
        this.requiredModeGroupRef = value;
    }
    
    
    
    @XmlElement(name="SUPPORTS-ASYNCHRONOUS-MODE-SWITCH")
    public Boolean getSupportsAsynchronousModeSwitch() {
        return this.supportsAsynchronousModeSwitch;
    }

    public void setSupportsAsynchronousModeSwitch(Boolean value) {
        this.supportsAsynchronousModeSwitch = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}