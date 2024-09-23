package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ClientServerApplicationErrorMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstApplicationErrorRef firstApplicationErrorRef;
    
    
    
    protected SecondApplicationErrorRef secondApplicationErrorRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="FIRST-APPLICATION-ERROR-REF")
    public FirstApplicationErrorRef getFirstApplicationErrorRef() {
        return this.firstApplicationErrorRef;
    }

    public void setFirstApplicationErrorRef(FirstApplicationErrorRef value) {
        this.firstApplicationErrorRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-APPLICATION-ERROR-REF")
    public SecondApplicationErrorRef getSecondApplicationErrorRef() {
        return this.secondApplicationErrorRef;
    }

    public void setSecondApplicationErrorRef(SecondApplicationErrorRef value) {
        this.secondApplicationErrorRef = value;
    }
    
    
}