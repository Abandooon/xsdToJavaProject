package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CycleRepetition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer baseCycle;
    
    
    
    protected CycleRepetitionType cycleRepetition;
    
    

    
    
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
    
    
    
    @XmlElement(name="BASE-CYCLE")
    public Integer getBaseCycle() {
        return this.baseCycle;
    }

    public void setBaseCycle(Integer value) {
        this.baseCycle = value;
    }
    
    
    
    @XmlElement(name="CYCLE-REPETITION")
    public CycleRepetitionType getCycleRepetition() {
        return this.cycleRepetition;
    }

    public void setCycleRepetition(CycleRepetitionType value) {
        this.cycleRepetition = value;
    }
    
    
}