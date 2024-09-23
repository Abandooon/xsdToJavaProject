package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EndToEndProtectionISignalIPdu {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer dataOffset;
    
    
    
    protected ISignalGroupRef iSignalGroupRef;
    
    
    
    protected ISignalIPduRef iSignalIPduRef;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-OFFSET")
    public Integer getDataOffset() {
        return this.dataOffset;
    }

    public void setDataOffset(Integer value) {
        this.dataOffset = value;
    }
    
    
    
    @XmlElement(name="I-SIGNAL-GROUP-REF")
    public ISignalGroupRef getISignalGroupRef() {
        return this.iSignalGroupRef;
    }

    public void setISignalGroupRef(ISignalGroupRef value) {
        this.iSignalGroupRef = value;
    }
    
    
    
    @XmlElement(name="I-SIGNAL-I-PDU-REF")
    public ISignalIPduRef getISignalIPduRef() {
        return this.iSignalIPduRef;
    }

    public void setISignalIPduRef(ISignalIPduRef value) {
        this.iSignalIPduRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}