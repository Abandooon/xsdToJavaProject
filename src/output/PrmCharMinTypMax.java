package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class PrmCharMinTypMax {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NumericalValue min;
    
    
    
    protected NumericalValue typ;
    
    
    
    protected NumericalValue max;
    
    

    
    
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
    
    
    
    @XmlElement(name="MIN")
    public NumericalValue getMin() {
        return this.min;
    }

    public void setMin(NumericalValue value) {
        this.min = value;
    }
    
    
    
    @XmlElement(name="TYP")
    public NumericalValue getTyp() {
        return this.typ;
    }

    public void setTyp(NumericalValue value) {
        this.typ = value;
    }
    
    
    
    @XmlElement(name="MAX")
    public NumericalValue getMax() {
        return this.max;
    }

    public void setMax(NumericalValue value) {
        this.max = value;
    }
    
    
}