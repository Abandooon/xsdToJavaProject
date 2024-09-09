package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LParagraph {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnumSimple l;
    
    
    
    protected ArrayList<Ft> ft;
    
    
    
    protected ArrayList<Traceref> traceRef;
    
    
    
    protected ArrayList<Tt> tt;
    
    
    
    protected ArrayList<Br> br;
    
    
    
    protected ArrayList<Xref> xref;
    
    
    
    protected ArrayList<Xreftarget> xrefTarget;
    
    
    
    protected ArrayList<E> e;
    
    
    
    protected ArrayList<Sup> sup;
    
    
    
    protected ArrayList<Sub> sub;
    
    
    
    protected ArrayList<Ie> ie;
    
    
    
    protected ArrayList<Std> std;
    
    
    
    protected ArrayList<Xdoc> xdoc;
    
    
    
    protected ArrayList<Xfile> xfile;
    
    

    
    
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
    
    
    
    @XmlElement(name="FT")
    public ArrayList<Ft> getFt() {
        return this.ft;
    }

    public void setFt(ArrayList<Ft> value) {
        this.ft = value;
    }
    
    
    
    @XmlElement(name="TRACE-REF")
    public ArrayList<Traceref> getTraceRef() {
        return this.traceRef;
    }

    public void setTraceRef(ArrayList<Traceref> value) {
        this.traceRef = value;
    }
    
    
    
    @XmlElement(name="TT")
    public ArrayList<Tt> getTt() {
        return this.tt;
    }

    public void setTt(ArrayList<Tt> value) {
        this.tt = value;
    }
    
    
    
    @XmlElement(name="BR")
    public ArrayList<Br> getBr() {
        return this.br;
    }

    public void setBr(ArrayList<Br> value) {
        this.br = value;
    }
    
    
    
    @XmlElement(name="XREF")
    public ArrayList<Xref> getXref() {
        return this.xref;
    }

    public void setXref(ArrayList<Xref> value) {
        this.xref = value;
    }
    
    
    
    @XmlElement(name="XREF-TARGET")
    public ArrayList<Xreftarget> getXrefTarget() {
        return this.xrefTarget;
    }

    public void setXrefTarget(ArrayList<Xreftarget> value) {
        this.xrefTarget = value;
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
    
    
    
    @XmlElement(name="STD")
    public ArrayList<Std> getStd() {
        return this.std;
    }

    public void setStd(ArrayList<Std> value) {
        this.std = value;
    }
    
    
    
    @XmlElement(name="XDOC")
    public ArrayList<Xdoc> getXdoc() {
        return this.xdoc;
    }

    public void setXdoc(ArrayList<Xdoc> value) {
        this.xdoc = value;
    }
    
    
    
    @XmlElement(name="XFILE")
    public ArrayList<Xfile> getXfile() {
        return this.xfile;
    }

    public void setXfile(ArrayList<Xfile> value) {
        this.xfile = value;
    }
    
    


    
    public static class TraceRef extends Ref {
        
        protected TraceableSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public TraceableSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(TraceableSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}