package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FmConditionByFeaturesAndSwSystemconsts {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Syscstringrefs> syscStringRefss;
    
    
    
    protected ArrayList<Syscrefs> syscRefss;
    
    
    
    protected ArrayList<Featurerefs> featureRefss;
    
    

    
    
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
    
    
    
    @XmlElement(name="FEATURE-REF")
    public ArrayList<Featurerefs> getFeatureRefss() {
        return this.featureRefss;
    }

    public void setFeatureRefss(ArrayList<Featurerefs> value) {
        this.featureRefss = value;
    }
    
    
}