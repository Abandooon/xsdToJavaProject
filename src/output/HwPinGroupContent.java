package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HwPinGroupContent {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Hwpins> hwPinss;
    
    
    
    protected ArrayList<Hwpingroups> hwPinGroupss;
    
    

    
    
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
    
    
    
    @XmlElement(name="HW-PIN")
    public ArrayList<Hwpins> getHwPinss() {
        return this.hwPinss;
    }

    public void setHwPinss(ArrayList<Hwpins> value) {
        this.hwPinss = value;
    }
    
    
    
    @XmlElement(name="HW-PIN-GROUP")
    public ArrayList<Hwpingroups> getHwPinGroupss() {
        return this.hwPinGroupss;
    }

    public void setHwPinGroupss(ArrayList<Hwpingroups> value) {
        this.hwPinGroupss = value;
    }
    
    
}