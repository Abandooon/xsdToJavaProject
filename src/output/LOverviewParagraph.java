package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LOverviewParagraph {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnumSimple l;
    
    
    
    protected ArrayList<Brs> brss;
    
    
    
    protected ArrayList<Fts> ftss;
    
    
    
    protected ArrayList<Tracerefs> traceRefss;
    
    
    
    protected ArrayList<Tts> ttss;
    
    
    
    protected ArrayList<Xrefs> xrefss;
    
    
    
    protected ArrayList<Xreftargets> xrefTargetss;
    
    
    
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
    
    
    
    @XmlAttribute(name="L")
    public LEnumSimple getL() {
        return this.l;
    }

    public void setL(LEnumSimple value) {
        this.l = value;
    }
    
    
    
    @XmlElement(name="BR")
    public ArrayList<Brs> getBrss() {
        return this.brss;
    }

    public void setBrss(ArrayList<Brs> value) {
        this.brss = value;
    }
    
    
    
    @XmlElement(name="FT")
    public ArrayList<Fts> getFtss() {
        return this.ftss;
    }

    public void setFtss(ArrayList<Fts> value) {
        this.ftss = value;
    }
    
    
    
    @XmlElement(name="TRACE-REF")
    public ArrayList<Tracerefs> getTraceRefss() {
        return this.traceRefss;
    }

    public void setTraceRefss(ArrayList<Tracerefs> value) {
        this.traceRefss = value;
    }
    
    
    
    @XmlElement(name="TT")
    public ArrayList<Tts> getTtss() {
        return this.ttss;
    }

    public void setTtss(ArrayList<Tts> value) {
        this.ttss = value;
    }
    
    
    
    @XmlElement(name="XREF")
    public ArrayList<Xrefs> getXrefss() {
        return this.xrefss;
    }

    public void setXrefss(ArrayList<Xrefs> value) {
        this.xrefss = value;
    }
    
    
    
    @XmlElement(name="XREF-TARGET")
    public ArrayList<Xreftargets> getXrefTargetss() {
        return this.xrefTargetss;
    }

    public void setXrefTargetss(ArrayList<Xreftargets> value) {
        this.xrefTargetss = value;
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