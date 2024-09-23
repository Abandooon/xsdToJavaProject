package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class McFunctionDataRefSet {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected McFunctionDataRefSetVariants mcFunctionDataRefSetVariants;
    
    

    
    
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
    
    
    
    @XmlElement(name="MC-FUNCTION-DATA-REF-SET-VARIANTS")
    public McFunctionDataRefSetVariants getMcFunctionDataRefSetVariants() {
        return this.mcFunctionDataRefSetVariants;
    }

    public void setMcFunctionDataRefSetVariants(McFunctionDataRefSetVariants value) {
        this.mcFunctionDataRefSetVariants = value;
    }
    
    
}