package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TextTableValuePair {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NumericalValueVariationPoint firstValue;
    
    
    
    protected NumericalValueVariationPoint secondValue;
    
    

    
    
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
    
    
    
    @XmlElement(name="FIRST-VALUE")
    public NumericalValueVariationPoint getFirstValue() {
        return this.firstValue;
    }

    public void setFirstValue(NumericalValueVariationPoint value) {
        this.firstValue = value;
    }
    
    
    
    @XmlElement(name="SECOND-VALUE")
    public NumericalValueVariationPoint getSecondValue() {
        return this.secondValue;
    }

    public void setSecondValue(NumericalValueVariationPoint value) {
        this.secondValue = value;
    }
    
    
}