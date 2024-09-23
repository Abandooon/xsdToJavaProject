package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class PerInstanceMemorySize {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger alignment;
    
    
    
    protected PerInstanceMemoryRef perInstanceMemoryRef;
    
    
    
    protected PositiveIntegerValueVariationPoint size;
    
    
    
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
    
    
    
    @XmlElement(name="ALIGNMENT")
    public PositiveInteger getAlignment() {
        return this.alignment;
    }

    public void setAlignment(PositiveInteger value) {
        this.alignment = value;
    }
    
    
    
    @XmlElement(name="PER-INSTANCE-MEMORY-REF")
    public PerInstanceMemoryRef getPerInstanceMemoryRef() {
        return this.perInstanceMemoryRef;
    }

    public void setPerInstanceMemoryRef(PerInstanceMemoryRef value) {
        this.perInstanceMemoryRef = value;
    }
    
    
    
    @XmlElement(name="SIZE")
    public PositiveIntegerValueVariationPoint getSize() {
        return this.size;
    }

    public void setSize(PositiveIntegerValueVariationPoint value) {
        this.size = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}