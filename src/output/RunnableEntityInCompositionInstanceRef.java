package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RunnableEntityInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextSwComponentPrototypeRef contextSwComponentPrototypeRef;
    
    
    
    protected TargetRunnableEntityRef targetRunnableEntityRef;
    
    
    
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
    
    
    
    @XmlElement(name="CONTEXT-SW-COMPONENT-PROTOTYPE-REF")
    public ContextSwComponentPrototypeRef getContextSwComponentPrototypeRef() {
        return this.contextSwComponentPrototypeRef;
    }

    public void setContextSwComponentPrototypeRef(ContextSwComponentPrototypeRef value) {
        this.contextSwComponentPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-RUNNABLE-ENTITY-REF")
    public TargetRunnableEntityRef getTargetRunnableEntityRef() {
        return this.targetRunnableEntityRef;
    }

    public void setTargetRunnableEntityRef(TargetRunnableEntityRef value) {
        this.targetRunnableEntityRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}