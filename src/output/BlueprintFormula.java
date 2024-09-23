package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BlueprintFormula {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Syscstringrefs> syscStringRefss;
    
    
    
    protected ArrayList<Syscrefs> syscRefss;
    
    
    
    protected ArrayList<Ecucqueryrefs> ecucQueryRefss;
    
    
    
    protected ArrayList<Ecucrefs> ecucRefss;
    
    
    
    protected ArrayList<Verbatims> verbatimss;
    
    

    
    
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
    
    
    
    @XmlElement(name="ECUC-QUERY-REF")
    public ArrayList<Ecucqueryrefs> getEcucQueryRefss() {
        return this.ecucQueryRefss;
    }

    public void setEcucQueryRefss(ArrayList<Ecucqueryrefs> value) {
        this.ecucQueryRefss = value;
    }
    
    
    
    @XmlElement(name="ECUC-REF")
    public ArrayList<Ecucrefs> getEcucRefss() {
        return this.ecucRefss;
    }

    public void setEcucRefss(ArrayList<Ecucrefs> value) {
        this.ecucRefss = value;
    }
    
    
    
    @XmlElement(name="VERBATIM")
    public ArrayList<Verbatims> getVerbatimss() {
        return this.verbatimss;
    }

    public void setVerbatimss(ArrayList<Verbatims> value) {
        this.verbatimss = value;
    }
    
    
}