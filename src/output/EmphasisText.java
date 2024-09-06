package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EmphasisText {

    
    protected java.lang.String s;
    
    protected java.lang.String t;
    
    protected java.lang.String color;
    
    protected EEnumFontSimple font;
    
    protected EEnumSimple type;
    
    protected ArrayList<Sub> sub;
    
    protected ArrayList<Sup> sup;
    
    protected ArrayList<Tt> tt;
    

    
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
    
    @XmlAttribute(name="COLOR")
    public java.lang.String getColor() {
        return this.color;
    }

    public void setColor(java.lang.String value) {
        this.color = value;
    }
    
    @XmlAttribute(name="FONT")
    public EEnumFontSimple getFont() {
        return this.font;
    }

    public void setFont(EEnumFontSimple value) {
        this.font = value;
    }
    
    @XmlAttribute(name="TYPE")
    public EEnumSimple getType() {
        return this.type;
    }

    public void setType(EEnumSimple value) {
        this.type = value;
    }
    
    @XmlElement(name="SUB")
    public ArrayList<Sub> getSub() {
        return this.sub;
    }

    public void setSub(ArrayList<Sub> value) {
        this.sub = value;
    }
    
    @XmlElement(name="SUP")
    public ArrayList<Sup> getSup() {
        return this.sup;
    }

    public void setSup(ArrayList<Sup> value) {
        this.sup = value;
    }
    
    @XmlElement(name="TT")
    public ArrayList<Tt> getTt() {
        return this.tt;
    }

    public void setTt(ArrayList<Tt> value) {
        this.tt = value;
    }
    

    
}