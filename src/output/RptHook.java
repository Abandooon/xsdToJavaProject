package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RptHook {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CIdentifier codeLabel;
    
    
    
    protected NmtokenString mcdIdentifier;
    
    
    
    protected AnyInstanceRef rptArHookIref;
    
    
    
    protected Sdgs sdgs;
    
    
    
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
    
    
    
    @XmlElement(name="CODE-LABEL")
    public CIdentifier getCodeLabel() {
        return this.codeLabel;
    }

    public void setCodeLabel(CIdentifier value) {
        this.codeLabel = value;
    }
    
    
    
    @XmlElement(name="MCD-IDENTIFIER")
    public NmtokenString getMcdIdentifier() {
        return this.mcdIdentifier;
    }

    public void setMcdIdentifier(NmtokenString value) {
        this.mcdIdentifier = value;
    }
    
    
    
    @XmlElement(name="RPT-AR-HOOK-IREF")
    public AnyInstanceRef getRptArHookIref() {
        return this.rptArHookIref;
    }

    public void setRptArHookIref(AnyInstanceRef value) {
        this.rptArHookIref = value;
    }
    
    
    
    @XmlElement(name="SDGS")
    public Sdgs getSdgs() {
        return this.sdgs;
    }

    public void setSdgs(Sdgs value) {
        this.sdgs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}