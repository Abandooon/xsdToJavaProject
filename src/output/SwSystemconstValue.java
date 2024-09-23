package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwSystemconstValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SwSystemconstRef swSystemconstRef;
    
    
    
    protected NumericalValueVariationPoint value;
    
    
    
    protected Annotations annotations;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-SYSTEMCONST-REF")
    public SwSystemconstRef getSwSystemconstRef() {
        return this.swSystemconstRef;
    }

    public void setSwSystemconstRef(SwSystemconstRef value) {
        this.swSystemconstRef = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public NumericalValueVariationPoint getValue() {
        return this.value;
    }

    public void setValue(NumericalValueVariationPoint value) {
        this.value = value;
    }
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }
    
    
}