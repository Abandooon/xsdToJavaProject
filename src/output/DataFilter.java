package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DataFilter {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DataFilterTypeEnum dataFilterType;
    
    
    
    protected UnlimitedInteger mask;
    
    
    
    protected UnlimitedInteger max;
    
    
    
    protected UnlimitedInteger min;
    
    
    
    protected PositiveInteger offset;
    
    
    
    protected PositiveInteger period;
    
    
    
    protected UnlimitedInteger x;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-FILTER-TYPE")
    public DataFilterTypeEnum getDataFilterType() {
        return this.dataFilterType;
    }

    public void setDataFilterType(DataFilterTypeEnum value) {
        this.dataFilterType = value;
    }
    
    
    
    @XmlElement(name="MASK")
    public UnlimitedInteger getMask() {
        return this.mask;
    }

    public void setMask(UnlimitedInteger value) {
        this.mask = value;
    }
    
    
    
    @XmlElement(name="MAX")
    public UnlimitedInteger getMax() {
        return this.max;
    }

    public void setMax(UnlimitedInteger value) {
        this.max = value;
    }
    
    
    
    @XmlElement(name="MIN")
    public UnlimitedInteger getMin() {
        return this.min;
    }

    public void setMin(UnlimitedInteger value) {
        this.min = value;
    }
    
    
    
    @XmlElement(name="OFFSET")
    public PositiveInteger getOffset() {
        return this.offset;
    }

    public void setOffset(PositiveInteger value) {
        this.offset = value;
    }
    
    
    
    @XmlElement(name="PERIOD")
    public PositiveInteger getPeriod() {
        return this.period;
    }

    public void setPeriod(PositiveInteger value) {
        this.period = value;
    }
    
    
    
    @XmlElement(name="X")
    public UnlimitedInteger getX() {
        return this.x;
    }

    public void setX(UnlimitedInteger value) {
        this.x = value;
    }
    
    
}