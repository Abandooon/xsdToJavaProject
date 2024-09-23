package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DynamicPart {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SegmentPositions segmentPositions;
    
    
    
    protected DynamicPartAlternatives dynamicPartAlternatives;
    
    
    
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
    
    
    
    @XmlElement(name="SEGMENT-POSITIONS")
    public SegmentPositions getSegmentPositions() {
        return this.segmentPositions;
    }

    public void setSegmentPositions(SegmentPositions value) {
        this.segmentPositions = value;
    }
    
    
    
    @XmlElement(name="DYNAMIC-PART-ALTERNATIVES")
    public DynamicPartAlternatives getDynamicPartAlternatives() {
        return this.dynamicPartAlternatives;
    }

    public void setDynamicPartAlternatives(DynamicPartAlternatives value) {
        this.dynamicPartAlternatives = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}