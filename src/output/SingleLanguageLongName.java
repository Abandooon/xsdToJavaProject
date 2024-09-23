package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SingleLanguageLongName {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Tts> ttss;
    
    
    
    protected ArrayList<Es> ess;
    
    
    
    protected ArrayList<Sups> supss;
    
    
    
    protected ArrayList<Subs> subss;
    
    
    
    protected ArrayList<Ies> iess;
    
    

    
    
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
    
    
    
    @XmlElement(name="TT")
    public ArrayList<Tts> getTtss() {
        return this.ttss;
    }

    public void setTtss(ArrayList<Tts> value) {
        this.ttss = value;
    }
    
    
    
    @XmlElement(name="E")
    public ArrayList<Es> getEss() {
        return this.ess;
    }

    public void setEss(ArrayList<Es> value) {
        this.ess = value;
    }
    
    
    
    @XmlElement(name="SUP")
    public ArrayList<Sups> getSupss() {
        return this.supss;
    }

    public void setSupss(ArrayList<Sups> value) {
        this.supss = value;
    }
    
    
    
    @XmlElement(name="SUB")
    public ArrayList<Subs> getSubss() {
        return this.subss;
    }

    public void setSubss(ArrayList<Subs> value) {
        this.subss = value;
    }
    
    
    
    @XmlElement(name="IE")
    public ArrayList<Ies> getIess() {
        return this.iess;
    }

    public void setIess(ArrayList<Ies> value) {
        this.iess = value;
    }
    
    
}