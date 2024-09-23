package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Entry {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AlignEnumSimple align;
    
    
    
    protected java.lang.String colname;
    
    
    
    protected java.lang.String colsep;
    
    
    
    protected java.lang.String morerows;
    
    
    
    protected java.lang.String nameend;
    
    
    
    protected java.lang.String namest;
    
    
    
    protected java.lang.String rotate;
    
    
    
    protected java.lang.String rowsep;
    
    
    
    protected java.lang.String spanname;
    
    
    
    protected ValignEnumSimple valign;
    
    
    
    protected String bgcolor;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="ALIGN")
    public AlignEnumSimple getAlign() {
        return this.align;
    }

    public void setAlign(AlignEnumSimple value) {
        this.align = value;
    }
    
    
    
    @XmlAttribute(name="COLNAME")
    public java.lang.String getColname() {
        return this.colname;
    }

    public void setColname(java.lang.String value) {
        this.colname = value;
    }
    
    
    
    @XmlAttribute(name="COLSEP")
    public java.lang.String getColsep() {
        return this.colsep;
    }

    public void setColsep(java.lang.String value) {
        this.colsep = value;
    }
    
    
    
    @XmlAttribute(name="MOREROWS")
    public java.lang.String getMorerows() {
        return this.morerows;
    }

    public void setMorerows(java.lang.String value) {
        this.morerows = value;
    }
    
    
    
    @XmlAttribute(name="NAMEEND")
    public java.lang.String getNameend() {
        return this.nameend;
    }

    public void setNameend(java.lang.String value) {
        this.nameend = value;
    }
    
    
    
    @XmlAttribute(name="NAMEST")
    public java.lang.String getNamest() {
        return this.namest;
    }

    public void setNamest(java.lang.String value) {
        this.namest = value;
    }
    
    
    
    @XmlAttribute(name="ROTATE")
    public java.lang.String getRotate() {
        return this.rotate;
    }

    public void setRotate(java.lang.String value) {
        this.rotate = value;
    }
    
    
    
    @XmlAttribute(name="ROWSEP")
    public java.lang.String getRowsep() {
        return this.rowsep;
    }

    public void setRowsep(java.lang.String value) {
        this.rowsep = value;
    }
    
    
    
    @XmlAttribute(name="SPANNAME")
    public java.lang.String getSpanname() {
        return this.spanname;
    }

    public void setSpanname(java.lang.String value) {
        this.spanname = value;
    }
    
    
    
    @XmlAttribute(name="VALIGN")
    public ValignEnumSimple getValign() {
        return this.valign;
    }

    public void setValign(ValignEnumSimple value) {
        this.valign = value;
    }
    
    
    
    @XmlElement(name="BGCOLOR")
    public String getBgcolor() {
        return this.bgcolor;
    }

    public void setBgcolor(String value) {
        this.bgcolor = value;
    }
    
    
}