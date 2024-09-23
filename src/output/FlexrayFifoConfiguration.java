package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FlexrayFifoConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean admitWithoutMessageId;
    
    
    
    protected Integer baseCycle;
    
    
    
    protected ChannelRef channelRef;
    
    
    
    protected Integer cycleRepetition;
    
    
    
    protected Integer fifoDepth;
    
    
    
    protected FifoRanges fifoRanges;
    
    
    
    protected Integer msgIdMask;
    
    
    
    protected Integer msgIdMatch;
    
    

    
    
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
    
    
    
    @XmlElement(name="ADMIT-WITHOUT-MESSAGE-ID")
    public Boolean getAdmitWithoutMessageId() {
        return this.admitWithoutMessageId;
    }

    public void setAdmitWithoutMessageId(Boolean value) {
        this.admitWithoutMessageId = value;
    }
    
    
    
    @XmlElement(name="BASE-CYCLE")
    public Integer getBaseCycle() {
        return this.baseCycle;
    }

    public void setBaseCycle(Integer value) {
        this.baseCycle = value;
    }
    
    
    
    @XmlElement(name="CHANNEL-REF")
    public ChannelRef getChannelRef() {
        return this.channelRef;
    }

    public void setChannelRef(ChannelRef value) {
        this.channelRef = value;
    }
    
    
    
    @XmlElement(name="CYCLE-REPETITION")
    public Integer getCycleRepetition() {
        return this.cycleRepetition;
    }

    public void setCycleRepetition(Integer value) {
        this.cycleRepetition = value;
    }
    
    
    
    @XmlElement(name="FIFO-DEPTH")
    public Integer getFifoDepth() {
        return this.fifoDepth;
    }

    public void setFifoDepth(Integer value) {
        this.fifoDepth = value;
    }
    
    
    
    @XmlElement(name="FIFO-RANGES")
    public FifoRanges getFifoRanges() {
        return this.fifoRanges;
    }

    public void setFifoRanges(FifoRanges value) {
        this.fifoRanges = value;
    }
    
    
    
    @XmlElement(name="MSG-ID-MASK")
    public Integer getMsgIdMask() {
        return this.msgIdMask;
    }

    public void setMsgIdMask(Integer value) {
        this.msgIdMask = value;
    }
    
    
    
    @XmlElement(name="MSG-ID-MATCH")
    public Integer getMsgIdMatch() {
        return this.msgIdMatch;
    }

    public void setMsgIdMatch(Integer value) {
        this.msgIdMatch = value;
    }
    
    
}