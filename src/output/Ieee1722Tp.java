package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ieee1722Tp {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TimeValue relativeRepresentationTime;
    
    
    
    protected PositiveInteger streamIdentifier;
    
    
    
    protected PositiveInteger subType;
    
    
    
    protected PositiveInteger version;
    
    

    
    
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
    
    
    
    @XmlElement(name="RELATIVE-REPRESENTATION-TIME")
    public TimeValue getRelativeRepresentationTime() {
        return this.relativeRepresentationTime;
    }

    public void setRelativeRepresentationTime(TimeValue value) {
        this.relativeRepresentationTime = value;
    }
    
    
    
    @XmlElement(name="STREAM-IDENTIFIER")
    public PositiveInteger getStreamIdentifier() {
        return this.streamIdentifier;
    }

    public void setStreamIdentifier(PositiveInteger value) {
        this.streamIdentifier = value;
    }
    
    
    
    @XmlElement(name="SUB-TYPE")
    public PositiveInteger getSubType() {
        return this.subType;
    }

    public void setSubType(PositiveInteger value) {
        this.subType = value;
    }
    
    
    
    @XmlElement(name="VERSION")
    public PositiveInteger getVersion() {
        return this.version;
    }

    public void setVersion(PositiveInteger value) {
        this.version = value;
    }
    
    
}