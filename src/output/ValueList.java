package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ValueList {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Vfs> vfss;
    
    
    
    protected ArrayList<Vs> vss;
    
    

    
    
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
    
    
    
    @XmlElement(name="VF")
    public ArrayList<Vfs> getVfss() {
        return this.vfss;
    }

    public void setVfss(ArrayList<Vfs> value) {
        this.vfss = value;
    }
    
    
    
    @XmlElement(name="V")
    public ArrayList<Vs> getVss() {
        return this.vss;
    }

    public void setVss(ArrayList<Vs> value) {
        this.vss = value;
    }
    
    
}