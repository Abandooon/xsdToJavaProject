package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CanControllerFdConfigurationRequirements {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer maxNumberOfTimeQuantaPerBit;
    
    
    
    protected Float maxSamplePoint;
    
    
    
    protected Float maxSyncJumpWidth;
    
    
    
    protected TimeValue maxTrcvDelayCompensationOffset;
    
    
    
    protected Integer minNumberOfTimeQuantaPerBit;
    
    
    
    protected Float minSamplePoint;
    
    
    
    protected Float minSyncJumpWidth;
    
    
    
    protected TimeValue minTrcvDelayCompensationOffset;
    
    
    
    protected PositiveInteger paddingValue;
    
    
    
    protected Boolean txBitRateSwitch;
    
    

    
    
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
    
    
    
    @XmlElement(name="MAX-NUMBER-OF-TIME-QUANTA-PER-BIT")
    public Integer getMaxNumberOfTimeQuantaPerBit() {
        return this.maxNumberOfTimeQuantaPerBit;
    }

    public void setMaxNumberOfTimeQuantaPerBit(Integer value) {
        this.maxNumberOfTimeQuantaPerBit = value;
    }
    
    
    
    @XmlElement(name="MAX-SAMPLE-POINT")
    public Float getMaxSamplePoint() {
        return this.maxSamplePoint;
    }

    public void setMaxSamplePoint(Float value) {
        this.maxSamplePoint = value;
    }
    
    
    
    @XmlElement(name="MAX-SYNC-JUMP-WIDTH")
    public Float getMaxSyncJumpWidth() {
        return this.maxSyncJumpWidth;
    }

    public void setMaxSyncJumpWidth(Float value) {
        this.maxSyncJumpWidth = value;
    }
    
    
    
    @XmlElement(name="MAX-TRCV-DELAY-COMPENSATION-OFFSET")
    public TimeValue getMaxTrcvDelayCompensationOffset() {
        return this.maxTrcvDelayCompensationOffset;
    }

    public void setMaxTrcvDelayCompensationOffset(TimeValue value) {
        this.maxTrcvDelayCompensationOffset = value;
    }
    
    
    
    @XmlElement(name="MIN-NUMBER-OF-TIME-QUANTA-PER-BIT")
    public Integer getMinNumberOfTimeQuantaPerBit() {
        return this.minNumberOfTimeQuantaPerBit;
    }

    public void setMinNumberOfTimeQuantaPerBit(Integer value) {
        this.minNumberOfTimeQuantaPerBit = value;
    }
    
    
    
    @XmlElement(name="MIN-SAMPLE-POINT")
    public Float getMinSamplePoint() {
        return this.minSamplePoint;
    }

    public void setMinSamplePoint(Float value) {
        this.minSamplePoint = value;
    }
    
    
    
    @XmlElement(name="MIN-SYNC-JUMP-WIDTH")
    public Float getMinSyncJumpWidth() {
        return this.minSyncJumpWidth;
    }

    public void setMinSyncJumpWidth(Float value) {
        this.minSyncJumpWidth = value;
    }
    
    
    
    @XmlElement(name="MIN-TRCV-DELAY-COMPENSATION-OFFSET")
    public TimeValue getMinTrcvDelayCompensationOffset() {
        return this.minTrcvDelayCompensationOffset;
    }

    public void setMinTrcvDelayCompensationOffset(TimeValue value) {
        this.minTrcvDelayCompensationOffset = value;
    }
    
    
    
    @XmlElement(name="PADDING-VALUE")
    public PositiveInteger getPaddingValue() {
        return this.paddingValue;
    }

    public void setPaddingValue(PositiveInteger value) {
        this.paddingValue = value;
    }
    
    
    
    @XmlElement(name="TX-BIT-RATE-SWITCH")
    public Boolean getTxBitRateSwitch() {
        return this.txBitRateSwitch;
    }

    public void setTxBitRateSwitch(Boolean value) {
        this.txBitRateSwitch = value;
    }
    
    
}