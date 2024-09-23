package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DynamicPartAlternative {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected IPduRef iPduRef;
    
    
    
    protected Boolean initialDynamicPart;
    
    
    
    protected Integer selectorFieldCode;
    
    

    
    
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
    
    
    
    @XmlElement(name="I-PDU-REF")
    public IPduRef getIPduRef() {
        return this.iPduRef;
    }

    public void setIPduRef(IPduRef value) {
        this.iPduRef = value;
    }
    
    
    
    @XmlElement(name="INITIAL-DYNAMIC-PART")
    public Boolean getInitialDynamicPart() {
        return this.initialDynamicPart;
    }

    public void setInitialDynamicPart(Boolean value) {
        this.initialDynamicPart = value;
    }
    
    
    
    @XmlElement(name="SELECTOR-FIELD-CODE")
    public Integer getSelectorFieldCode() {
        return this.selectorFieldCode;
    }

    public void setSelectorFieldCode(Integer value) {
        this.selectorFieldCode = value;
    }
    
    
}