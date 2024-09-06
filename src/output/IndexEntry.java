package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class IndexEntry {

    
    protected java.lang.String s;
    
    protected java.lang.String t;
    
    protected ArrayList<Sup> sup;
    
    protected ArrayList<Sub> sub;
    

    
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
    

    
}