package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswModuleClientServerEntry {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected EncapsulatedEntryRef encapsulatedEntryRef;
    
    
    
    protected Boolean isReentrant;
    
    
    
    protected Boolean isSynchronous;
    
    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
        return this.shortName;
    }

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="ENCAPSULATED-ENTRY-REF")
    public EncapsulatedEntryRef getEncapsulatedEntryRef() {
        return this.encapsulatedEntryRef;
    }

    public void setEncapsulatedEntryRef(EncapsulatedEntryRef value) {
        this.encapsulatedEntryRef = value;
    }
    
    
    
    @XmlElement(name="IS-REENTRANT")
    public Boolean getIsReentrant() {
        return this.isReentrant;
    }

    public void setIsReentrant(Boolean value) {
        this.isReentrant = value;
    }
    
    
    
    @XmlElement(name="IS-SYNCHRONOUS")
    public Boolean getIsSynchronous() {
        return this.isSynchronous;
    }

    public void setIsSynchronous(Boolean value) {
        this.isSynchronous = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}