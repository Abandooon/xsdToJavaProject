package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class InternalConstrs {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Limit lowerLimit;
    
    
    
    protected Limit upperLimit;
    
    
    
    protected ScaleConstrs scaleConstrs;
    
    
    
    protected NumericalValue maxGradient;
    
    
    
    protected NumericalValue maxDiff;
    
    
    
    protected MonotonyEnum monotony;
    
    

    
    
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
    
    
    
    @XmlElement(name="LOWER-LIMIT")
    public Limit getLowerLimit() {
        return this.lowerLimit;
    }

    public void setLowerLimit(Limit value) {
        this.lowerLimit = value;
    }
    
    
    
    @XmlElement(name="UPPER-LIMIT")
    public Limit getUpperLimit() {
        return this.upperLimit;
    }

    public void setUpperLimit(Limit value) {
        this.upperLimit = value;
    }
    
    
    
    @XmlElement(name="SCALE-CONSTRS")
    public ScaleConstrs getScaleConstrs() {
        return this.scaleConstrs;
    }

    public void setScaleConstrs(ScaleConstrs value) {
        this.scaleConstrs = value;
    }
    
    
    
    @XmlElement(name="MAX-GRADIENT")
    public NumericalValue getMaxGradient() {
        return this.maxGradient;
    }

    public void setMaxGradient(NumericalValue value) {
        this.maxGradient = value;
    }
    
    
    
    @XmlElement(name="MAX-DIFF")
    public NumericalValue getMaxDiff() {
        return this.maxDiff;
    }

    public void setMaxDiff(NumericalValue value) {
        this.maxDiff = value;
    }
    
    
    
    @XmlElement(name="MONOTONY")
    public MonotonyEnum getMonotony() {
        return this.monotony;
    }

    public void setMonotony(MonotonyEnum value) {
        this.monotony = value;
    }
    
    
}