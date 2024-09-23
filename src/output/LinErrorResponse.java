package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LinErrorResponse {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FrameTriggeringRef frameTriggeringRef;
    
    
    
    protected Integer responseErrorPosition;
    
    

    
    
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
    
    
    
    @XmlElement(name="FRAME-TRIGGERING-REF")
    public FrameTriggeringRef getFrameTriggeringRef() {
        return this.frameTriggeringRef;
    }

    public void setFrameTriggeringRef(FrameTriggeringRef value) {
        this.frameTriggeringRef = value;
    }
    
    
    
    @XmlElement(name="RESPONSE-ERROR-POSITION")
    public Integer getResponseErrorPosition() {
        return this.responseErrorPosition;
    }

    public void setResponseErrorPosition(Integer value) {
        this.responseErrorPosition = value;
    }
    
    
}