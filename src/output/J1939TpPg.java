package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class J1939TpPg {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DirectPduRef directPduRef;
    
    
    
    protected Integer pgn;
    
    
    
    protected Boolean requestable;
    
    
    
    protected SduRefs sduRefs;
    
    
    
    protected TpSduRef tpSduRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="DIRECT-PDU-REF")
    public DirectPduRef getDirectPduRef() {
        return this.directPduRef;
    }

    public void setDirectPduRef(DirectPduRef value) {
        this.directPduRef = value;
    }
    
    
    
    @XmlElement(name="PGN")
    public Integer getPgn() {
        return this.pgn;
    }

    public void setPgn(Integer value) {
        this.pgn = value;
    }
    
    
    
    @XmlElement(name="REQUESTABLE")
    public Boolean getRequestable() {
        return this.requestable;
    }

    public void setRequestable(Boolean value) {
        this.requestable = value;
    }
    
    
    
    @XmlElement(name="SDU-REFS")
    public SduRefs getSduRefs() {
        return this.sduRefs;
    }

    public void setSduRefs(SduRefs value) {
        this.sduRefs = value;
    }
    
    
    
    @XmlElement(name="TP-SDU-REF")
    public TpSduRef getTpSduRef() {
        return this.tpSduRef;
    }

    public void setTpSduRef(TpSduRef value) {
        this.tpSduRef = value;
    }
    
    
}