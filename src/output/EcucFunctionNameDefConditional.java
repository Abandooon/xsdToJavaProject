package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucFunctionNameDefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VerbatimString defaultValue;
    
    
    
    protected PositiveInteger maxLength;
    
    
    
    protected PositiveInteger minLength;
    
    
    
    protected RegularExpression regularExpression;
    
    
    
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
    
    
    
    @XmlElement(name="DEFAULT-VALUE")
    public VerbatimString getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(VerbatimString value) {
        this.defaultValue = value;
    }
    
    
    
    @XmlElement(name="MAX-LENGTH")
    public PositiveInteger getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(PositiveInteger value) {
        this.maxLength = value;
    }
    
    
    
    @XmlElement(name="MIN-LENGTH")
    public PositiveInteger getMinLength() {
        return this.minLength;
    }

    public void setMinLength(PositiveInteger value) {
        this.minLength = value;
    }
    
    
    
    @XmlElement(name="REGULAR-EXPRESSION")
    public RegularExpression getRegularExpression() {
        return this.regularExpression;
    }

    public void setRegularExpression(RegularExpression value) {
        this.regularExpression = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}