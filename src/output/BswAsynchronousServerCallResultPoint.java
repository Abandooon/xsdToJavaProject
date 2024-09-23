package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswAsynchronousServerCallResultPoint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected ContextLimitationRefs contextLimitationRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected AsynchronousServerCallPointRef asynchronousServerCallPointRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
        return this.shortName;
    }

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-LIMITATION-REFS")
    public ContextLimitationRefs getContextLimitationRefs() {
        return this.contextLimitationRefs;
    }

    public void setContextLimitationRefs(ContextLimitationRefs value) {
        this.contextLimitationRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="ASYNCHRONOUS-SERVER-CALL-POINT-REF")
    public AsynchronousServerCallPointRef getAsynchronousServerCallPointRef() {
        return this.asynchronousServerCallPointRef;
    }

    public void setAsynchronousServerCallPointRef(AsynchronousServerCallPointRef value) {
        this.asynchronousServerCallPointRef = value;
    }
    
    
}