package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwAxisGeneric {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SwAxisTypeRef swAxisTypeRef;
    
    
    
    protected IntegerValueVariationPoint swNumberOfAxisPoints;
    
    
    
    protected SwGenericAxisParams swGenericAxisParams;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-AXIS-TYPE-REF")
    public SwAxisTypeRef getSwAxisTypeRef() {
        return this.swAxisTypeRef;
    }

    public void setSwAxisTypeRef(SwAxisTypeRef value) {
        this.swAxisTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-NUMBER-OF-AXIS-POINTS")
    public IntegerValueVariationPoint getSwNumberOfAxisPoints() {
        return this.swNumberOfAxisPoints;
    }

    public void setSwNumberOfAxisPoints(IntegerValueVariationPoint value) {
        this.swNumberOfAxisPoints = value;
    }
    
    
    
    @XmlElement(name="SW-GENERIC-AXIS-PARAMS")
    public SwGenericAxisParams getSwGenericAxisParams() {
        return this.swGenericAxisParams;
    }

    public void setSwGenericAxisParams(SwGenericAxisParams value) {
        this.swGenericAxisParams = value;
    }
    
    
}