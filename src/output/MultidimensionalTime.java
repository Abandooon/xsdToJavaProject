package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class MultidimensionalTime {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CseCodeTypeString cseCode;
    
    
    
    protected Integer cseCodeFactor;
    
    

    
    
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
    
    
    
    @XmlElement(name="CSE-CODE")
    public CseCodeTypeString getCseCode() {
        return this.cseCode;
    }

    public void setCseCode(CseCodeTypeString value) {
        this.cseCode = value;
    }
    
    
    
    @XmlElement(name="CSE-CODE-FACTOR")
    public Integer getCseCodeFactor() {
        return this.cseCodeFactor;
    }

    public void setCseCodeFactor(Integer value) {
        this.cseCodeFactor = value;
    }
    
    


    
}