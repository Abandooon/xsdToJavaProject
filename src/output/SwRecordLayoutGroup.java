package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwRecordLayoutGroup {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected AsamRecordLayoutSemantics category;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected AxisIndexType swRecordLayoutGroupAxis;
    
    
    
    protected NmtokenString swRecordLayoutGroupIndex;
    
    
    
    protected SwGenericAxisParamTypeRef swGenericAxisParamTypeRef;
    
    
    
    protected RecordLayoutIteratorPoint swRecordLayoutGroupFrom;
    
    
    
    protected RecordLayoutIteratorPoint swRecordLayoutGroupTo;
    
    
    
    protected Integer swRecordLayoutGroupStep;
    
    
    
    protected Identifier swRecordLayoutComponent;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
        return this.shortLabel;
    }

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public AsamRecordLayoutSemantics getCategory() {
        return this.category;
    }

    public void setCategory(AsamRecordLayoutSemantics value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
        return this.desc;
    }

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-GROUP-AXIS")
    public AxisIndexType getSwRecordLayoutGroupAxis() {
        return this.swRecordLayoutGroupAxis;
    }

    public void setSwRecordLayoutGroupAxis(AxisIndexType value) {
        this.swRecordLayoutGroupAxis = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-GROUP-INDEX")
    public NmtokenString getSwRecordLayoutGroupIndex() {
        return this.swRecordLayoutGroupIndex;
    }

    public void setSwRecordLayoutGroupIndex(NmtokenString value) {
        this.swRecordLayoutGroupIndex = value;
    }
    
    
    
    @XmlElement(name="SW-GENERIC-AXIS-PARAM-TYPE-REF")
    public SwGenericAxisParamTypeRef getSwGenericAxisParamTypeRef() {
        return this.swGenericAxisParamTypeRef;
    }

    public void setSwGenericAxisParamTypeRef(SwGenericAxisParamTypeRef value) {
        this.swGenericAxisParamTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-GROUP-FROM")
    public RecordLayoutIteratorPoint getSwRecordLayoutGroupFrom() {
        return this.swRecordLayoutGroupFrom;
    }

    public void setSwRecordLayoutGroupFrom(RecordLayoutIteratorPoint value) {
        this.swRecordLayoutGroupFrom = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-GROUP-TO")
    public RecordLayoutIteratorPoint getSwRecordLayoutGroupTo() {
        return this.swRecordLayoutGroupTo;
    }

    public void setSwRecordLayoutGroupTo(RecordLayoutIteratorPoint value) {
        this.swRecordLayoutGroupTo = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-GROUP-STEP")
    public Integer getSwRecordLayoutGroupStep() {
        return this.swRecordLayoutGroupStep;
    }

    public void setSwRecordLayoutGroupStep(Integer value) {
        this.swRecordLayoutGroupStep = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-COMPONENT")
    public Identifier getSwRecordLayoutComponent() {
        return this.swRecordLayoutComponent;
    }

    public void setSwRecordLayoutComponent(Identifier value) {
        this.swRecordLayoutComponent = value;
    }
    
    
}