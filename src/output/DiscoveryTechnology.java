package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DiscoveryTechnology {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiscoveryTechnologyEnum name;
    
    
    
    protected String version;
    
    

    
    
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
    
    
    
    @XmlElement(name="NAME")
    public DiscoveryTechnologyEnum getName() {
        return this.name;
    }

    public void setName(DiscoveryTechnologyEnum value) {
        this.name = value;
    }
    
    
    
    @XmlElement(name="VERSION")
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String value) {
        this.version = value;
    }
    
    
}