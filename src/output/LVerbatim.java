package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LVerbatim {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnumSimple l;
    
    
    
    
    
    protected ArrayList<Tt> tt;
    
    
    
    protected ArrayList<E> e;
    
    
    
    protected ArrayList<Xref> xref;
    
    
    
    protected ArrayList<Br> br;
    
    

    
    
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
    public ArrayList<Tt> getTt() {
        return this.tt;
    }

    public void setTt(ArrayList<Tt> value) {
        this.tt = value;
    }
    
    
    
    @XmlElement(name="E")
    public ArrayList<E> getE() {
        return this.e;
    }

    public void setE(ArrayList<E> value) {
        this.e = value;
    }
    
    
    
    @XmlElement(name="XREF")
    public ArrayList<Xref> getXref() {
        return this.xref;
    }

    public void setXref(ArrayList<Xref> value) {
        this.xref = value;
    }
    
    
    
    @XmlElement(name="BR")
    public ArrayList<Br> getBr() {
        return this.br;
    }

    public void setBr(ArrayList<Br> value) {
        this.br = value;
    }
    
    


    
}