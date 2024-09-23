package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TransmissionModeCondition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DataFilter dataFilter;
    
    
    
    protected ISignalInIPduRef iSignalInIPduRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-FILTER")
    public DataFilter getDataFilter() {
        return this.dataFilter;
    }

    public void setDataFilter(DataFilter value) {
        this.dataFilter = value;
    }
    
    
    
    @XmlElement(name="I-SIGNAL-IN-I-PDU-REF")
    public ISignalInIPduRef getISignalInIPduRef() {
        return this.iSignalInIPduRef;
    }

    public void setISignalInIPduRef(ISignalInIPduRef value) {
        this.iSignalInIPduRef = value;
    }
    
    
}