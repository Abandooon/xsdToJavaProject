package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DocumentationBlock {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Msrqueryp2s> msrQueryP2ss;
    
    
    
    protected ArrayList<Ps> pss;
    
    
    
    protected ArrayList<Verbatims> verbatimss;
    
    
    
    protected ArrayList<Lists> listss;
    
    
    
    protected ArrayList<Deflists> defListss;
    
    
    
    protected ArrayList<Labeledlists> labeledListss;
    
    
    
    protected ArrayList<Formulas> formulass;
    
    
    
    protected ArrayList<Figures> figuress;
    
    
    
    protected ArrayList<Notes> notess;
    
    
    
    protected ArrayList<Traces> tracess;
    
    
    
    protected ArrayList<Structuredreqs> structuredReqss;
    
    

    
    
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
    public ArrayList<Msrqueryp2s> getMsrQueryP2ss() {
        return this.msrQueryP2ss;
    }

    public void setMsrQueryP2ss(ArrayList<Msrqueryp2s> value) {
        this.msrQueryP2ss = value;
    }
    
    
    
    @XmlElement(name="P")
    public ArrayList<Ps> getPss() {
        return this.pss;
    }

    public void setPss(ArrayList<Ps> value) {
        this.pss = value;
    }
    
    
    
    @XmlElement(name="VERBATIM")
    public ArrayList<Verbatims> getVerbatimss() {
        return this.verbatimss;
    }

    public void setVerbatimss(ArrayList<Verbatims> value) {
        this.verbatimss = value;
    }
    
    
    
    @XmlElement(name="LIST")
    public ArrayList<Lists> getListss() {
        return this.listss;
    }

    public void setListss(ArrayList<Lists> value) {
        this.listss = value;
    }
    
    
    
    @XmlElement(name="DEF-LIST")
    public ArrayList<Deflists> getDefListss() {
        return this.defListss;
    }

    public void setDefListss(ArrayList<Deflists> value) {
        this.defListss = value;
    }
    
    
    
    @XmlElement(name="LABELED-LIST")
    public ArrayList<Labeledlists> getLabeledListss() {
        return this.labeledListss;
    }

    public void setLabeledListss(ArrayList<Labeledlists> value) {
        this.labeledListss = value;
    }
    
    
    
    @XmlElement(name="FORMULA")
    public ArrayList<Formulas> getFormulass() {
        return this.formulass;
    }

    public void setFormulass(ArrayList<Formulas> value) {
        this.formulass = value;
    }
    
    
    
    @XmlElement(name="FIGURE")
    public ArrayList<Figures> getFiguress() {
        return this.figuress;
    }

    public void setFiguress(ArrayList<Figures> value) {
        this.figuress = value;
    }
    
    
    
    @XmlElement(name="NOTE")
    public ArrayList<Notes> getNotess() {
        return this.notess;
    }

    public void setNotess(ArrayList<Notes> value) {
        this.notess = value;
    }
    
    
    
    @XmlElement(name="TRACE")
    public ArrayList<Traces> getTracess() {
        return this.tracess;
    }

    public void setTracess(ArrayList<Traces> value) {
        this.tracess = value;
    }
    
    
    
    @XmlElement(name="STRUCTURED-REQ")
    public ArrayList<Structuredreqs> getStructuredReqss() {
        return this.structuredReqss;
    }

    public void setStructuredReqss(ArrayList<Structuredreqs> value) {
        this.structuredReqss = value;
    }
    
    
}