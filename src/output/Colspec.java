package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Colspec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AlignEnumSimple align;
    
    
    
    protected java.lang.String colname;
    
    
    
    protected java.lang.String colnum;
    
    
    
    protected java.lang.String colsep;
    
    
    
    protected java.lang.String colwidth;
    
    
    
    protected java.lang.String rowsep;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="COLNUM")
    public java.lang.String getColnum() {
        return this.colnum;
    }

    public void setColnum(java.lang.String value) {
        this.colnum = value;
    }
    
    
    
    @XmlAttribute(name="COLSEP")
    public java.lang.String getColsep() {
        return this.colsep;
    }

    public void setColsep(java.lang.String value) {
        this.colsep = value;
    }
    
    
    
    @XmlAttribute(name="COLWIDTH")
    public java.lang.String getColwidth() {
        return this.colwidth;
    }

    public void setColwidth(java.lang.String value) {
        this.colwidth = value;
    }
    
    
    
    @XmlAttribute(name="ROWSEP")
    public java.lang.String getRowsep() {
        return this.rowsep;
    }

    public void setRowsep(java.lang.String value) {
        this.rowsep = value;
    }
    
    
}