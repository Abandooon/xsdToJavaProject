package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ShortNameFragment {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String role;
    
    
    
    protected Identifier fragment;
    
    

    
    
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
    
    
    
    @XmlElement(name="ROLE")
    public String getRole() {
        return this.role;
    }

    public void setRole(String value) {
        this.role = value;
    }
    
    
    
    @XmlElement(name="FRAGMENT")
    public Identifier getFragment() {
        return this.fragment;
    }

    public void setFragment(Identifier value) {
        this.fragment = value;
    }
    
    
}