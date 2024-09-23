package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LifeCycleInfo {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LcObjectRef lcObjectRef;
    
    
    
    protected LcStateRef lcStateRef;
    
    
    
    protected LifeCyclePeriod periodBegin;
    
    
    
    protected LifeCyclePeriod periodEnd;
    
    
    
    protected DocumentationBlock remark;
    
    
    
    protected UseInsteadRefs useInsteadRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="LC-OBJECT-REF")
    public LcObjectRef getLcObjectRef() {
        return this.lcObjectRef;
    }

    public void setLcObjectRef(LcObjectRef value) {
        this.lcObjectRef = value;
    }
    
    
    
    @XmlElement(name="LC-STATE-REF")
    public LcStateRef getLcStateRef() {
        return this.lcStateRef;
    }

    public void setLcStateRef(LcStateRef value) {
        this.lcStateRef = value;
    }
    
    
    
    @XmlElement(name="PERIOD-BEGIN")
    public LifeCyclePeriod getPeriodBegin() {
        return this.periodBegin;
    }

    public void setPeriodBegin(LifeCyclePeriod value) {
        this.periodBegin = value;
    }
    
    
    
    @XmlElement(name="PERIOD-END")
    public LifeCyclePeriod getPeriodEnd() {
        return this.periodEnd;
    }

    public void setPeriodEnd(LifeCyclePeriod value) {
        this.periodEnd = value;
    }
    
    
    
    @XmlElement(name="REMARK")
    public DocumentationBlock getRemark() {
        return this.remark;
    }

    public void setRemark(DocumentationBlock value) {
        this.remark = value;
    }
    
    
    
    @XmlElement(name="USE-INSTEAD-REFS")
    public UseInsteadRefs getUseInsteadRefs() {
        return this.useInsteadRefs;
    }

    public void setUseInsteadRefs(UseInsteadRefs value) {
        this.useInsteadRefs = value;
    }
    
    
}