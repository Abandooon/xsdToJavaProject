package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class MultilanguageLongName {

    
    protected java.lang.String s;
    
    protected java.lang.String t;
    
    protected LLongName l4;
    

    
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
    
    @XmlElement(name="L-4")
    public LLongName getL4() {
        return this.l4;
    }

    public void setL4(LLongName value) {
        this.l4 = value;
    }
    

    
}