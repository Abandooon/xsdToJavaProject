package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ApplicationValueSpecification {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected Identifier category;
    
    
    
    protected SwAxisConts swAxisConts;
    
    
    
    protected SwValueCont swValueCont;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
        return this.shortLabel;
    }

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public Identifier getCategory() {
        return this.category;
    }

    public void setCategory(Identifier value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="SW-AXIS-CONTS")
    public SwAxisConts getSwAxisConts() {
        return this.swAxisConts;
    }

    public void setSwAxisConts(SwAxisConts value) {
        this.swAxisConts = value;
    }
    
    
    
    @XmlElement(name="SW-VALUE-CONT")
    public SwValueCont getSwValueCont() {
        return this.swValueCont;
    }

    public void setSwValueCont(SwValueCont value) {
        this.swValueCont = value;
    }
    
    
}