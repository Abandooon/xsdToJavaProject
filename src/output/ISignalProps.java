package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ISignalProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected HandleOutOfRangeEnum handleOutOfRange;
    
    

    
    
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
    
    
    
    @XmlElement(name="HANDLE-OUT-OF-RANGE")
    public HandleOutOfRangeEnum getHandleOutOfRange() {
        return this.handleOutOfRange;
    }

    public void setHandleOutOfRange(HandleOutOfRangeEnum value) {
        this.handleOutOfRange = value;
    }
    
    
}