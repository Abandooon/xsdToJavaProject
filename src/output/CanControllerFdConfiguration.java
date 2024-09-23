package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CanControllerFdConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger paddingValue;
    
    
    
    protected PositiveInteger propSeg;
    
    
    
    protected PositiveInteger syncJumpWidth;
    
    
    
    protected PositiveInteger timeSeg1;
    
    
    
    protected PositiveInteger timeSeg2;
    
    
    
    protected TimeValue trcvDelayCompensationOffset;
    
    
    
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
    
    
    
    @XmlElement(name="PADDING-VALUE")
    public PositiveInteger getPaddingValue() {
        return this.paddingValue;
    }

    public void setPaddingValue(PositiveInteger value) {
        this.paddingValue = value;
    }
    
    
    
    @XmlElement(name="PROP-SEG")
    public PositiveInteger getPropSeg() {
        return this.propSeg;
    }

    public void setPropSeg(PositiveInteger value) {
        this.propSeg = value;
    }
    
    
    
    @XmlElement(name="SYNC-JUMP-WIDTH")
    public PositiveInteger getSyncJumpWidth() {
        return this.syncJumpWidth;
    }

    public void setSyncJumpWidth(PositiveInteger value) {
        this.syncJumpWidth = value;
    }
    
    
    
    @XmlElement(name="TIME-SEG-1")
    public PositiveInteger getTimeSeg1() {
        return this.timeSeg1;
    }

    public void setTimeSeg1(PositiveInteger value) {
        this.timeSeg1 = value;
    }
    
    
    
    @XmlElement(name="TIME-SEG-2")
    public PositiveInteger getTimeSeg2() {
        return this.timeSeg2;
    }

    public void setTimeSeg2(PositiveInteger value) {
        this.timeSeg2 = value;
    }
    
    
    
    @XmlElement(name="TRCV-DELAY-COMPENSATION-OFFSET")
    public TimeValue getTrcvDelayCompensationOffset() {
        return this.trcvDelayCompensationOffset;
    }

    public void setTrcvDelayCompensationOffset(TimeValue value) {
        this.trcvDelayCompensationOffset = value;
    }
    
    
    
    @XmlElement(name="TX-BIT-RATE-SWITCH")
    public Boolean getTxBitRateSwitch() {
        return this.txBitRateSwitch;
    }

    public void setTxBitRateSwitch(Boolean value) {
        this.txBitRateSwitch = value;
    }
    
    
}