package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ConstantSpecificationMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ApplConstantRef applConstantRef;
    
    
    
    protected ImplConstantRef implConstantRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="APPL-CONSTANT-REF")
    public ApplConstantRef getApplConstantRef() {
        return this.applConstantRef;
    }

    public void setApplConstantRef(ApplConstantRef value) {
        this.applConstantRef = value;
    }
    
    
    
    @XmlElement(name="IMPL-CONSTANT-REF")
    public ImplConstantRef getImplConstantRef() {
        return this.implConstantRef;
    }

    public void setImplConstantRef(ImplConstantRef value) {
        this.implConstantRef = value;
    }
    
    
}