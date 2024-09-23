package com.example;

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
    
    
    
    protected ArrayList<Subs> subss;
    
    
    
    protected ArrayList<Sups> supss;
    
    
    
    protected ArrayList<Tts> ttss;
    
    

    
    
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
    public ArrayList<Subs> getSubss() {
        return this.subss;
    }

    public void setSubss(ArrayList<Subs> value) {
        this.subss = value;
    }
    
    
    
    @XmlElement(name="SUP")
    public ArrayList<Sups> getSupss() {
        return this.supss;
    }

    public void setSupss(ArrayList<Sups> value) {
        this.supss = value;
    }
    
    
    
    @XmlElement(name="TT")
    public ArrayList<Tts> getTtss() {
        return this.ttss;
    }

    public void setTtss(ArrayList<Tts> value) {
        this.ttss = value;
    }
    
    
}