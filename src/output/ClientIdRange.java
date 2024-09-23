package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ClientIdRange {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Limit lowerLimit;
    
    
    
    protected Limit upperLimit;
    
    

    
    
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
    
    
    
    @XmlElement(name="LOWER-LIMIT")
    public Limit getLowerLimit() {
        return this.lowerLimit;
    }

    public void setLowerLimit(Limit value) {
        this.lowerLimit = value;
    }
    
    
    
    @XmlElement(name="UPPER-LIMIT")
    public Limit getUpperLimit() {
        return this.upperLimit;
    }

    public void setUpperLimit(Limit value) {
        this.upperLimit = value;
    }
    
    
}