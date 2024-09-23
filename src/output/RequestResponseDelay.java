package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RequestResponseDelay {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TimeValue maxValue;
    
    
    
    protected TimeValue minValue;
    
    

    
    
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
    
    
    
    @XmlElement(name="MAX-VALUE")
    public TimeValue getMaxValue() {
        return this.maxValue;
    }

    public void setMaxValue(TimeValue value) {
        this.maxValue = value;
    }
    
    
    
    @XmlElement(name="MIN-VALUE")
    public TimeValue getMinValue() {
        return this.minValue;
    }

    public void setMinValue(TimeValue value) {
        this.minValue = value;
    }
    
    
}