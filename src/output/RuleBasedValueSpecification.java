package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RuleBasedValueSpecification {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier rule;
    
    
    
    protected Argumentss argumentss;
    
    
    
    protected Integer maxSizeToFill;
    
    

    
    
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
    
    
    
    @XmlElement(name="RULE")
    public Identifier getRule() {
        return this.rule;
    }

    public void setRule(Identifier value) {
        this.rule = value;
    }
    
    
    
    @XmlElement(name="ARGUMENTSS")
    public Argumentss getArgumentss() {
        return this.argumentss;
    }

    public void setArgumentss(Argumentss value) {
        this.argumentss = value;
    }
    
    
    
    @XmlElement(name="MAX-SIZE-TO-FILL")
    public Integer getMaxSizeToFill() {
        return this.maxSizeToFill;
    }

    public void setMaxSizeToFill(Integer value) {
        this.maxSizeToFill = value;
    }
    
    
}