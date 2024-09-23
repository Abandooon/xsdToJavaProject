package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TriggerMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstTriggerRef firstTriggerRef;
    
    
    
    protected SecondTriggerRef secondTriggerRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="FIRST-TRIGGER-REF")
    public FirstTriggerRef getFirstTriggerRef() {
        return this.firstTriggerRef;
    }

    public void setFirstTriggerRef(FirstTriggerRef value) {
        this.firstTriggerRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-TRIGGER-REF")
    public SecondTriggerRef getSecondTriggerRef() {
        return this.secondTriggerRef;
    }

    public void setSecondTriggerRef(SecondTriggerRef value) {
        this.secondTriggerRef = value;
    }
    
    
}