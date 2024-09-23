package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class StaticPart {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SegmentPositions segmentPositions;
    
    
    
    protected IPduRef iPduRef;
    
    
    
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
    
    
    
    @XmlElement(name="I-PDU-REF")
    public IPduRef getIPduRef() {
        return this.iPduRef;
    }

    public void setIPduRef(IPduRef value) {
        this.iPduRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}