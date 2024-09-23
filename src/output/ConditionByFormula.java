package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ConditionByFormula {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BindingTimeEnumSimple bindingTime;
    
    
    
    protected ArrayList<Syscstringrefs> syscStringRefss;
    
    
    
    protected ArrayList<Syscrefs> syscRefss;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="BINDING-TIME")
    public BindingTimeEnumSimple getBindingTime() {
        return this.bindingTime;
    }

    public void setBindingTime(BindingTimeEnumSimple value) {
        this.bindingTime = value;
    }
    
    
    
    @XmlElement(name="SYSC-STRING-REF")
    public ArrayList<Syscstringrefs> getSyscStringRefss() {
        return this.syscStringRefss;
    }

    public void setSyscStringRefss(ArrayList<Syscstringrefs> value) {
        this.syscStringRefss = value;
    }
    
    
    
    @XmlElement(name="SYSC-REF")
    public ArrayList<Syscrefs> getSyscRefss() {
        return this.syscRefss;
    }

    public void setSyscRefss(ArrayList<Syscrefs> value) {
        this.syscRefss = value;
    }
    
    
}