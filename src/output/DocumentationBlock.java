package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DocumentationBlock {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Msrqueryp2> msrQueryP2;
    
    
    
    protected ArrayList<P> p;
    
    
    
    protected ArrayList<Verbatim> verbatim;
    
    
    
    protected ArrayList<List> list;
    
    
    
    protected ArrayList<Deflist> defList;
    
    
    
    protected ArrayList<Labeledlist> labeledList;
    
    
    
    protected ArrayList<Formula> formula;
    
    
    
    protected ArrayList<Note> note;
    
    
    
    protected ArrayList<Trace> trace;
    
    
    
    protected ArrayList<Structuredreq> structuredReq;
    
    

    
    
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
    
    
    
    @XmlElement(name="MSR-QUERY-P-2")
    public ArrayList<Msrqueryp2> getMsrQueryP2() {
        return this.msrQueryP2;
    }

    public void setMsrQueryP2(ArrayList<Msrqueryp2> value) {
        this.msrQueryP2 = value;
    }
    
    
    
    @XmlElement(name="P")
    public ArrayList<P> getP() {
        return this.p;
    }

    public void setP(ArrayList<P> value) {
        this.p = value;
    }
    
    
    
    @XmlElement(name="VERBATIM")
    public ArrayList<Verbatim> getVerbatim() {
        return this.verbatim;
    }

    public void setVerbatim(ArrayList<Verbatim> value) {
        this.verbatim = value;
    }
    
    
    
    @XmlElement(name="LIST")
    public ArrayList<List> getList() {
        return this.list;
    }

    public void setList(ArrayList<List> value) {
        this.list = value;
    }
    
    
    
    @XmlElement(name="DEF-LIST")
    public ArrayList<Deflist> getDefList() {
        return this.defList;
    }

    public void setDefList(ArrayList<Deflist> value) {
        this.defList = value;
    }
    
    
    
    @XmlElement(name="LABELED-LIST")
    public ArrayList<Labeledlist> getLabeledList() {
        return this.labeledList;
    }

    public void setLabeledList(ArrayList<Labeledlist> value) {
        this.labeledList = value;
    }
    
    
    
    @XmlElement(name="FORMULA")
    public ArrayList<Formula> getFormula() {
        return this.formula;
    }

    public void setFormula(ArrayList<Formula> value) {
        this.formula = value;
    }
    
    
    
    @XmlElement(name="NOTE")
    public ArrayList<Note> getNote() {
        return this.note;
    }

    public void setNote(ArrayList<Note> value) {
        this.note = value;
    }
    
    
    
    @XmlElement(name="TRACE")
    public ArrayList<Trace> getTrace() {
        return this.trace;
    }

    public void setTrace(ArrayList<Trace> value) {
        this.trace = value;
    }
    
    
    
    @XmlElement(name="STRUCTURED-REQ")
    public ArrayList<Structuredreq> getStructuredReq() {
        return this.structuredReq;
    }

    public void setStructuredReq(ArrayList<Structuredreq> value) {
        this.structuredReq = value;
    }
    
    


    
}