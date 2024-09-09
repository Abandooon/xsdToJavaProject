package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CIdentifier {

    
    
    protected java.lang.String value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String namePattern;
    
    

    
    
    @XmlValue
    public java.lang.String getValue() {
        return this.value;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }
    
    
    
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
    
    
    
    @XmlAttribute(name="NAME-PATTERN")
    public java.lang.String getNamePattern() {
        return this.namePattern;
    }

    public void setNamePattern(java.lang.String value) {
        this.namePattern = value;
    }
    
    


    
}