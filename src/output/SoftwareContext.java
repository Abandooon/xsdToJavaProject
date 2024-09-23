package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SoftwareContext {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String input;
    
    
    
    protected String state;
    
    

    
    
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
    
    
    
    @XmlElement(name="INPUT")
    public String getInput() {
        return this.input;
    }

    public void setInput(String value) {
        this.input = value;
    }
    
    
    
    @XmlElement(name="STATE")
    public String getState() {
        return this.state;
    }

    public void setState(String value) {
        this.state = value;
    }
    
    
}