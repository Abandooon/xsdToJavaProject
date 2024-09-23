package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class McFunctionDataRefSetConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FlatMapEntryRefs flatMapEntryRefs;
    
    
    
    protected McDataInstanceRefs mcDataInstanceRefs;
    
    
    
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
    
    
    
    @XmlElement(name="FLAT-MAP-ENTRY-REFS")
    public FlatMapEntryRefs getFlatMapEntryRefs() {
        return this.flatMapEntryRefs;
    }

    public void setFlatMapEntryRefs(FlatMapEntryRefs value) {
        this.flatMapEntryRefs = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-REFS")
    public McDataInstanceRefs getMcDataInstanceRefs() {
        return this.mcDataInstanceRefs;
    }

    public void setMcDataInstanceRefs(McDataInstanceRefs value) {
        this.mcDataInstanceRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}