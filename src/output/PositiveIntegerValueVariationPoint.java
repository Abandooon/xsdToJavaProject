package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class PositiveIntegerValueVariationPoint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BindingTimeEnumSimple bindingTime;
    
    
    
    protected java.lang.String blueprintValue;
    
    
    
    protected java.lang.String sd;
    
    
    
    protected java.lang.String shortLabel;
    
    
    
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
    
    
    
    @XmlAttribute(name="BLUEPRINT-VALUE")
    public java.lang.String getBlueprintValue() {
        return this.blueprintValue;
    }

    public void setBlueprintValue(java.lang.String value) {
        this.blueprintValue = value;
    }
    
    
    
    @XmlAttribute(name="SD")
    public java.lang.String getSd() {
        return this.sd;
    }

    public void setSd(java.lang.String value) {
        this.sd = value;
    }
    
    
    
    @XmlAttribute(name="SHORT-LABEL")
    public java.lang.String getShortLabel() {
        return this.shortLabel;
    }

    public void setShortLabel(java.lang.String value) {
        this.shortLabel = value;
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