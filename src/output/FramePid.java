package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FramePid {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer index;
    
    
    
    protected PositiveInteger pid;
    
    

    
    
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
    
    
    
    @XmlElement(name="INDEX")
    public Integer getIndex() {
        return this.index;
    }

    public void setIndex(Integer value) {
        this.index = value;
    }
    
    
    
    @XmlElement(name="PID")
    public PositiveInteger getPid() {
        return this.pid;
    }

    public void setPid(PositiveInteger value) {
        this.pid = value;
    }
    
    
}