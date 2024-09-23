package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ApplicationEntry {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected TimeValue delay;
    
    
    
    protected Integer positionInTable;
    
    
    
    protected FrameTriggeringRef frameTriggeringRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="DELAY")
    public TimeValue getDelay() {
        return this.delay;
    }

    public void setDelay(TimeValue value) {
        this.delay = value;
    }
    
    
    
    @XmlElement(name="POSITION-IN-TABLE")
    public Integer getPositionInTable() {
        return this.positionInTable;
    }

    public void setPositionInTable(Integer value) {
        this.positionInTable = value;
    }
    
    
    
    @XmlElement(name="FRAME-TRIGGERING-REF")
    public FrameTriggeringRef getFrameTriggeringRef() {
        return this.frameTriggeringRef;
    }

    public void setFrameTriggeringRef(FrameTriggeringRef value) {
        this.frameTriggeringRef = value;
    }
    
    
}