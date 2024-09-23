package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ConfidenceInterval {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultidimensionalTime lowerBound;
    
    
    
    protected Float propability;
    
    
    
    protected MultidimensionalTime upperBound;
    
    

    
    
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
    
    
    
    @XmlElement(name="LOWER-BOUND")
    public MultidimensionalTime getLowerBound() {
        return this.lowerBound;
    }

    public void setLowerBound(MultidimensionalTime value) {
        this.lowerBound = value;
    }
    
    
    
    @XmlElement(name="PROPABILITY")
    public Float getPropability() {
        return this.propability;
    }

    public void setPropability(Float value) {
        this.propability = value;
    }
    
    
    
    @XmlElement(name="UPPER-BOUND")
    public MultidimensionalTime getUpperBound() {
        return this.upperBound;
    }

    public void setUpperBound(MultidimensionalTime value) {
        this.upperBound = value;
    }
    
    
}