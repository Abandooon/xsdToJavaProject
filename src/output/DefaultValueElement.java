package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DefaultValueElement {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer elementByteValue;
    
    
    
    protected Integer elementPosition;
    
    

    
    
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
    
    
    
    @XmlElement(name="ELEMENT-BYTE-VALUE")
    public Integer getElementByteValue() {
        return this.elementByteValue;
    }

    public void setElementByteValue(Integer value) {
        this.elementByteValue = value;
    }
    
    
    
    @XmlElement(name="ELEMENT-POSITION")
    public Integer getElementPosition() {
        return this.elementPosition;
    }

    public void setElementPosition(Integer value) {
        this.elementPosition = value;
    }
    
    
}