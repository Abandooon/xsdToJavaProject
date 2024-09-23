package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class J1939TpConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TpConnectionIdent ident;
    
    
    
    protected Boolean broadcast;
    
    
    
    protected PositiveInteger bufferRatio;
    
    
    
    protected Boolean cancellation;
    
    
    
    protected DataPduRef dataPduRef;
    
    
    
    protected DirectPduRef directPduRef;
    
    
    
    protected Boolean dynamicBs;
    
    
    
    protected FlowControlPduRefs flowControlPduRefs;
    
    
    
    protected PositiveInteger maxBs;
    
    
    
    protected PositiveInteger maxExpBs;
    
    
    
    protected ReceiverRefs receiverRefs;
    
    
    
    protected Boolean retry;
    
    
    
    protected TpPgs tpPgs;
    
    
    
    protected TpSduRefs tpSduRefs;
    
    
    
    protected TransmitterRef transmitterRef;
    
    
    
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
    
    
    
    @XmlElement(name="IDENT")
    public TpConnectionIdent getIdent() {
        return this.ident;
    }

    public void setIdent(TpConnectionIdent value) {
        this.ident = value;
    }
    
    
    
    @XmlElement(name="BROADCAST")
    public Boolean getBroadcast() {
        return this.broadcast;
    }

    public void setBroadcast(Boolean value) {
        this.broadcast = value;
    }
    
    
    
    @XmlElement(name="BUFFER-RATIO")
    public PositiveInteger getBufferRatio() {
        return this.bufferRatio;
    }

    public void setBufferRatio(PositiveInteger value) {
        this.bufferRatio = value;
    }
    
    
    
    @XmlElement(name="CANCELLATION")
    public Boolean getCancellation() {
        return this.cancellation;
    }

    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }
    
    
    
    @XmlElement(name="DATA-PDU-REF")
    public DataPduRef getDataPduRef() {
        return this.dataPduRef;
    }

    public void setDataPduRef(DataPduRef value) {
        this.dataPduRef = value;
    }
    
    
    
    @XmlElement(name="DIRECT-PDU-REF")
    public DirectPduRef getDirectPduRef() {
        return this.directPduRef;
    }

    public void setDirectPduRef(DirectPduRef value) {
        this.directPduRef = value;
    }
    
    
    
    @XmlElement(name="DYNAMIC-BS")
    public Boolean getDynamicBs() {
        return this.dynamicBs;
    }

    public void setDynamicBs(Boolean value) {
        this.dynamicBs = value;
    }
    
    
    
    @XmlElement(name="FLOW-CONTROL-PDU-REFS")
    public FlowControlPduRefs getFlowControlPduRefs() {
        return this.flowControlPduRefs;
    }

    public void setFlowControlPduRefs(FlowControlPduRefs value) {
        this.flowControlPduRefs = value;
    }
    
    
    
    @XmlElement(name="MAX-BS")
    public PositiveInteger getMaxBs() {
        return this.maxBs;
    }

    public void setMaxBs(PositiveInteger value) {
        this.maxBs = value;
    }
    
    
    
    @XmlElement(name="MAX-EXP-BS")
    public PositiveInteger getMaxExpBs() {
        return this.maxExpBs;
    }

    public void setMaxExpBs(PositiveInteger value) {
        this.maxExpBs = value;
    }
    
    
    
    @XmlElement(name="RECEIVER-REFS")
    public ReceiverRefs getReceiverRefs() {
        return this.receiverRefs;
    }

    public void setReceiverRefs(ReceiverRefs value) {
        this.receiverRefs = value;
    }
    
    
    
    @XmlElement(name="RETRY")
    public Boolean getRetry() {
        return this.retry;
    }

    public void setRetry(Boolean value) {
        this.retry = value;
    }
    
    
    
    @XmlElement(name="TP-PGS")
    public TpPgs getTpPgs() {
        return this.tpPgs;
    }

    public void setTpPgs(TpPgs value) {
        this.tpPgs = value;
    }
    
    
    
    @XmlElement(name="TP-SDU-REFS")
    public TpSduRefs getTpSduRefs() {
        return this.tpSduRefs;
    }

    public void setTpSduRefs(TpSduRefs value) {
        this.tpSduRefs = value;
    }
    
    
    
    @XmlElement(name="TRANSMITTER-REF")
    public TransmitterRef getTransmitterRef() {
        return this.transmitterRef;
    }

    public void setTransmitterRef(TransmitterRef value) {
        this.transmitterRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}