package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HwAttributeValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Annotation annotation;
    
    
    
    protected HwAttributeDefRef hwAttributeDefRef;
    
    
    
    protected NumericalValueVariationPoint v;
    
    
    
    protected VerbatimString vt;
    
    
    
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
    
    
    
    @XmlElement(name="ANNOTATION")
    public Annotation getAnnotation() {
        return this.annotation;
    }

    public void setAnnotation(Annotation value) {
        this.annotation = value;
    }
    
    
    
    @XmlElement(name="HW-ATTRIBUTE-DEF-REF")
    public HwAttributeDefRef getHwAttributeDefRef() {
        return this.hwAttributeDefRef;
    }

    public void setHwAttributeDefRef(HwAttributeDefRef value) {
        this.hwAttributeDefRef = value;
    }
    
    
    
    @XmlElement(name="V")
    public NumericalValueVariationPoint getV() {
        return this.v;
    }

    public void setV(NumericalValueVariationPoint value) {
        this.v = value;
    }
    
    
    
    @XmlElement(name="VT")
    public VerbatimString getVt() {
        return this.vt;
    }

    public void setVt(VerbatimString value) {
        this.vt = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}