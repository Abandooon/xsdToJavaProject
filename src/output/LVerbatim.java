package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LVerbatim {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnumSimple l;
    
    
    
    
    
    protected ArrayList<Tts> ttss;
    
    
    
    protected ArrayList<Es> ess;
    
    
    
    protected ArrayList<Xrefs> xrefss;
    
    
    
    protected ArrayList<Brs> brss;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="L")
    public LEnumSimple getL() {
        return this.l;
    }

    public void setL(LEnumSimple value) {
        this.l = value;
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
    
    
    
    @XmlElement(name="XREF")
    public ArrayList<Xrefs> getXrefss() {
        return this.xrefss;
    }

    public void setXrefss(ArrayList<Xrefs> value) {
        this.xrefss = value;
    }
    
    
    
    @XmlElement(name="BR")
    public ArrayList<Brs> getBrss() {
        return this.brss;
    }

    public void setBrss(ArrayList<Brs> value) {
        this.brss = value;
    }
    
    
}