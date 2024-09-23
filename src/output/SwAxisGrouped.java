package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwAxisGrouped {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SharedAxisTypeRef sharedAxisTypeRef;
    
    
    
    protected AxisIndexType swAxisIndex;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHARED-AXIS-TYPE-REF")
    public SharedAxisTypeRef getSharedAxisTypeRef() {
        return this.sharedAxisTypeRef;
    }

    public void setSharedAxisTypeRef(SharedAxisTypeRef value) {
        this.sharedAxisTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-AXIS-INDEX")
    public AxisIndexType getSwAxisIndex() {
        return this.swAxisIndex;
    }

    public void setSwAxisIndex(AxisIndexType value) {
        this.swAxisIndex = value;
    }
    
    
}