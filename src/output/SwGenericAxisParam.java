package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwGenericAxisParam {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SwGenericAxisParamTypeRef swGenericAxisParamTypeRef;
    
    
    
    protected NumericalValueVariationPoint vf;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-GENERIC-AXIS-PARAM-TYPE-REF")
    public SwGenericAxisParamTypeRef getSwGenericAxisParamTypeRef() {
        return this.swGenericAxisParamTypeRef;
    }

    public void setSwGenericAxisParamTypeRef(SwGenericAxisParamTypeRef value) {
        this.swGenericAxisParamTypeRef = value;
    }
    
    
    
    @XmlElement(name="VF")
    public NumericalValueVariationPoint getVf() {
        return this.vf;
    }

    public void setVf(NumericalValueVariationPoint value) {
        this.vf = value;
    }
    
    
}