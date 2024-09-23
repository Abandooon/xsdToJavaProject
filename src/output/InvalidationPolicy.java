package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class InvalidationPolicy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DataElementRef dataElementRef;
    
    
    
    protected HandleInvalidEnum handleInvalid;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-ELEMENT-REF")
    public DataElementRef getDataElementRef() {
        return this.dataElementRef;
    }

    public void setDataElementRef(DataElementRef value) {
        this.dataElementRef = value;
    }
    
    
    
    @XmlElement(name="HANDLE-INVALID")
    public HandleInvalidEnum getHandleInvalid() {
        return this.handleInvalid;
    }

    public void setHandleInvalid(HandleInvalidEnum value) {
        this.handleInvalid = value;
    }
    
    
}