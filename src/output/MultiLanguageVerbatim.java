package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class MultiLanguageVerbatim {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String si;
    
    
    
    protected java.lang.String view;
    
    
    
    protected ChapterEnumBreakSimple break;
    
    
    
    protected KeepWithPreviousEnumSimple keepWithPrevious;
    
    
    
    protected java.lang.String allowBreak;
    
    
    
    protected FloatEnumSimple float;
    
    
    
    protected java.lang.String helpEntry;
    
    
    
    protected PgwideEnumSimple pgwide;
    
    
    
    protected LVerbatim l5;
    
    
    
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
    
    
    
    @XmlAttribute(name="SI")
    public java.lang.String getSi() {
        return this.si;
    }

    public void setSi(java.lang.String value) {
        this.si = value;
    }
    
    
    
    @XmlAttribute(name="VIEW")
    public java.lang.String getView() {
        return this.view;
    }

    public void setView(java.lang.String value) {
        this.view = value;
    }
    
    
    
    @XmlAttribute(name="BREAK")
    public ChapterEnumBreakSimple getBreak() {
        return this.break;
    }

    public void setBreak(ChapterEnumBreakSimple value) {
        this.break = value;
    }
    
    
    
    @XmlAttribute(name="KEEP-WITH-PREVIOUS")
    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        return this.keepWithPrevious;
    }

    public void setKeepWithPrevious(KeepWithPreviousEnumSimple value) {
        this.keepWithPrevious = value;
    }
    
    
    
    @XmlAttribute(name="ALLOW-BREAK")
    public java.lang.String getAllowBreak() {
        return this.allowBreak;
    }

    public void setAllowBreak(java.lang.String value) {
        this.allowBreak = value;
    }
    
    
    
    @XmlAttribute(name="FLOAT")
    public FloatEnumSimple getFloat() {
        return this.float;
    }

    public void setFloat(FloatEnumSimple value) {
        this.float = value;
    }
    
    
    
    @XmlAttribute(name="HELP-ENTRY")
    public java.lang.String getHelpEntry() {
        return this.helpEntry;
    }

    public void setHelpEntry(java.lang.String value) {
        this.helpEntry = value;
    }
    
    
    
    @XmlAttribute(name="PGWIDE")
    public PgwideEnumSimple getPgwide() {
        return this.pgwide;
    }

    public void setPgwide(PgwideEnumSimple value) {
        this.pgwide = value;
    }
    
    
    
    @XmlElement(name="L-5")
    public LVerbatim getL5() {
        return this.l5;
    }

    public void setL5(LVerbatim value) {
        this.l5 = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    


    
}