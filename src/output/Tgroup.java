package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tgroup {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AlignEnumSimple align;
    
    
    
    protected java.lang.String cols;
    
    
    
    protected java.lang.String colsep;
    
    
    
    protected java.lang.String rowsep;
    
    
    
    protected Colspec colspec;
    
    
    
    protected Tbody thead;
    
    
    
    protected Tbody tfoot;
    
    
    
    protected Tbody tbody;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="COLS")
    public java.lang.String getCols() {
        return this.cols;
    }

    public void setCols(java.lang.String value) {
        this.cols = value;
    }
    
    
    
    @XmlAttribute(name="COLSEP")
    public java.lang.String getColsep() {
        return this.colsep;
    }

    public void setColsep(java.lang.String value) {
        this.colsep = value;
    }
    
    
    
    @XmlAttribute(name="ROWSEP")
    public java.lang.String getRowsep() {
        return this.rowsep;
    }

    public void setRowsep(java.lang.String value) {
        this.rowsep = value;
    }
    
    
    
    @XmlElement(name="COLSPEC")
    public Colspec getColspec() {
        return this.colspec;
    }

    public void setColspec(Colspec value) {
        this.colspec = value;
    }
    
    
    
    @XmlElement(name="THEAD")
    public Tbody getThead() {
        return this.thead;
    }

    public void setThead(Tbody value) {
        this.thead = value;
    }
    
    
    
    @XmlElement(name="TFOOT")
    public Tbody getTfoot() {
        return this.tfoot;
    }

    public void setTfoot(Tbody value) {
        this.tfoot = value;
    }
    
    
    
    @XmlElement(name="TBODY")
    public Tbody getTbody() {
        return this.tbody;
    }

    public void setTbody(Tbody value) {
        this.tbody = value;
    }
    
    
}