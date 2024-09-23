package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ForbiddenSignalPath {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected Operations operations;
    
    
    
    protected PhysicalChannelRefs physicalChannelRefs;
    
    
    
    protected Signals signals;
    
    

    
    
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
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="OPERATIONS")
    public Operations getOperations() {
        return this.operations;
    }

    public void setOperations(Operations value) {
        this.operations = value;
    }
    
    
    
    @XmlElement(name="PHYSICAL-CHANNEL-REFS")
    public PhysicalChannelRefs getPhysicalChannelRefs() {
        return this.physicalChannelRefs;
    }

    public void setPhysicalChannelRefs(PhysicalChannelRefs value) {
        this.physicalChannelRefs = value;
    }
    
    
    
    @XmlElement(name="SIGNALS")
    public Signals getSignals() {
        return this.signals;
    }

    public void setSignals(Signals value) {
        this.signals = value;
    }
    
    
}