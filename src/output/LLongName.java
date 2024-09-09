package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LLongName {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnumSimple l;
    
    
    
    protected ArrayList<Tt> tt;
    
    
    
    protected ArrayList<E> e;
    
    
    
    protected ArrayList<Sup> sup;
    
    
    
    protected ArrayList<Sub> sub;
    
    
    
    protected ArrayList<Ie> ie;
    
    

    
    
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
    
    
    
    @XmlElement(name="SUP")
    public ArrayList<Sup> getSup() {
        return this.sup;
    }

    public void setSup(ArrayList<Sup> value) {
        this.sup = value;
    }
    
    
    
    @XmlElement(name="SUB")
    public ArrayList<Sub> getSub() {
        return this.sub;
    }

    public void setSub(ArrayList<Sub> value) {
        this.sub = value;
    }
    
    
    
    @XmlElement(name="IE")
    public ArrayList<Ie> getIe() {
        return this.ie;
    }

    public void setIe(ArrayList<Ie> value) {
        this.ie = value;
    }
    
    


    
}