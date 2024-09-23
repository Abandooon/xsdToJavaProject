package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucQueryExpression {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Configelementdefglobalrefs> configElementDefGlobalRefss;
    
    
    
    protected ArrayList<Configelementdeflocalrefs> configElementDefLocalRefss;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONFIG-ELEMENT-DEF-GLOBAL-REF")
    public ArrayList<Configelementdefglobalrefs> getConfigElementDefGlobalRefss() {
        return this.configElementDefGlobalRefss;
    }

    public void setConfigElementDefGlobalRefss(ArrayList<Configelementdefglobalrefs> value) {
        this.configElementDefGlobalRefss = value;
    }
    
    
    
    @XmlElement(name="CONFIG-ELEMENT-DEF-LOCAL-REF")
    public ArrayList<Configelementdeflocalrefs> getConfigElementDefLocalRefss() {
        return this.configElementDefLocalRefss;
    }

    public void setConfigElementDefLocalRefss(ArrayList<Configelementdeflocalrefs> value) {
        this.configElementDefLocalRefss = value;
    }
    
    
}