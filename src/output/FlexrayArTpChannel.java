package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FlexrayArTpChannel {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FrArTpAckType ackType;
    
    
    
    protected Boolean cancellation;
    
    
    
    protected Boolean extendedAddressing;
    
    
    
    protected FlowControlPduRef flowControlPduRef;
    
    
    
    protected Integer maxAr;
    
    
    
    protected Integer maxAs;
    
    
    
    protected Integer maxBs;
    
    
    
    protected Integer maxBufferRequest;
    
    
    
    protected PositiveInteger maxFcWait;
    
    
    
    protected Integer maxFrIf;
    
    
    
    protected Integer maxRetries;
    
    
    
    protected MaximumMessageLengthType maximumMessageLength;
    
    
    
    protected TimeValue minimumMulticastSeperationTime;
    
    
    
    protected TimeValue minimumSeparationTime;
    
    
    
    protected Boolean multicastSegmentation;
    
    
    
    protected NPduRefs nPduRefs;
    
    
    
    protected PduPools pduPools;
    
    
    
    protected TimeValue timeBr;
    
    
    
    protected TimeValue timeBuffer;
    
    
    
    protected TimeValue timeCs;
    
    
    
    protected TimeValue timeFrIf;
    
    
    
    protected TimeValue timeoutAr;
    
    
    
    protected TimeValue timeoutAs;
    
    
    
    protected TimeValue timeoutBs;
    
    
    
    protected TimeValue timeoutCr;
    
    
    
    protected TpConnections tpConnections;
    
    
    
    protected Boolean transmitCancellation;
    
    
    
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
    
    
    
    @XmlElement(name="ACK-TYPE")
    public FrArTpAckType getAckType() {
        return this.ackType;
    }

    public void setAckType(FrArTpAckType value) {
        this.ackType = value;
    }
    
    
    
    @XmlElement(name="CANCELLATION")
    public Boolean getCancellation() {
        return this.cancellation;
    }

    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }
    
    
    
    @XmlElement(name="EXTENDED-ADDRESSING")
    public Boolean getExtendedAddressing() {
        return this.extendedAddressing;
    }

    public void setExtendedAddressing(Boolean value) {
        this.extendedAddressing = value;
    }
    
    
    
    @XmlElement(name="FLOW-CONTROL-PDU-REF")
    public FlowControlPduRef getFlowControlPduRef() {
        return this.flowControlPduRef;
    }

    public void setFlowControlPduRef(FlowControlPduRef value) {
        this.flowControlPduRef = value;
    }
    
    
    
    @XmlElement(name="MAX-AR")
    public Integer getMaxAr() {
        return this.maxAr;
    }

    public void setMaxAr(Integer value) {
        this.maxAr = value;
    }
    
    
    
    @XmlElement(name="MAX-AS")
    public Integer getMaxAs() {
        return this.maxAs;
    }

    public void setMaxAs(Integer value) {
        this.maxAs = value;
    }
    
    
    
    @XmlElement(name="MAX-BS")
    public Integer getMaxBs() {
        return this.maxBs;
    }

    public void setMaxBs(Integer value) {
        this.maxBs = value;
    }
    
    
    
    @XmlElement(name="MAX-BUFFER-REQUEST")
    public Integer getMaxBufferRequest() {
        return this.maxBufferRequest;
    }

    public void setMaxBufferRequest(Integer value) {
        this.maxBufferRequest = value;
    }
    
    
    
    @XmlElement(name="MAX-FC-WAIT")
    public PositiveInteger getMaxFcWait() {
        return this.maxFcWait;
    }

    public void setMaxFcWait(PositiveInteger value) {
        this.maxFcWait = value;
    }
    
    
    
    @XmlElement(name="MAX-FR-IF")
    public Integer getMaxFrIf() {
        return this.maxFrIf;
    }

    public void setMaxFrIf(Integer value) {
        this.maxFrIf = value;
    }
    
    
    
    @XmlElement(name="MAX-RETRIES")
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public void setMaxRetries(Integer value) {
        this.maxRetries = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-MESSAGE-LENGTH")
    public MaximumMessageLengthType getMaximumMessageLength() {
        return this.maximumMessageLength;
    }

    public void setMaximumMessageLength(MaximumMessageLengthType value) {
        this.maximumMessageLength = value;
    }
    
    
    
    @XmlElement(name="MINIMUM-MULTICAST-SEPERATION-TIME")
    public TimeValue getMinimumMulticastSeperationTime() {
        return this.minimumMulticastSeperationTime;
    }

    public void setMinimumMulticastSeperationTime(TimeValue value) {
        this.minimumMulticastSeperationTime = value;
    }
    
    
    
    @XmlElement(name="MINIMUM-SEPARATION-TIME")
    public TimeValue getMinimumSeparationTime() {
        return this.minimumSeparationTime;
    }

    public void setMinimumSeparationTime(TimeValue value) {
        this.minimumSeparationTime = value;
    }
    
    
    
    @XmlElement(name="MULTICAST-SEGMENTATION")
    public Boolean getMulticastSegmentation() {
        return this.multicastSegmentation;
    }

    public void setMulticastSegmentation(Boolean value) {
        this.multicastSegmentation = value;
    }
    
    
    
    @XmlElement(name="N-PDU-REFS")
    public NPduRefs getNPduRefs() {
        return this.nPduRefs;
    }

    public void setNPduRefs(NPduRefs value) {
        this.nPduRefs = value;
    }
    
    
    
    @XmlElement(name="PDU-POOLS")
    public PduPools getPduPools() {
        return this.pduPools;
    }

    public void setPduPools(PduPools value) {
        this.pduPools = value;
    }
    
    
    
    @XmlElement(name="TIME-BR")
    public TimeValue getTimeBr() {
        return this.timeBr;
    }

    public void setTimeBr(TimeValue value) {
        this.timeBr = value;
    }
    
    
    
    @XmlElement(name="TIME-BUFFER")
    public TimeValue getTimeBuffer() {
        return this.timeBuffer;
    }

    public void setTimeBuffer(TimeValue value) {
        this.timeBuffer = value;
    }
    
    
    
    @XmlElement(name="TIME-CS")
    public TimeValue getTimeCs() {
        return this.timeCs;
    }

    public void setTimeCs(TimeValue value) {
        this.timeCs = value;
    }
    
    
    
    @XmlElement(name="TIME-FR-IF")
    public TimeValue getTimeFrIf() {
        return this.timeFrIf;
    }

    public void setTimeFrIf(TimeValue value) {
        this.timeFrIf = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-AR")
    public TimeValue getTimeoutAr() {
        return this.timeoutAr;
    }

    public void setTimeoutAr(TimeValue value) {
        this.timeoutAr = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-AS")
    public TimeValue getTimeoutAs() {
        return this.timeoutAs;
    }

    public void setTimeoutAs(TimeValue value) {
        this.timeoutAs = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-BS")
    public TimeValue getTimeoutBs() {
        return this.timeoutBs;
    }

    public void setTimeoutBs(TimeValue value) {
        this.timeoutBs = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-CR")
    public TimeValue getTimeoutCr() {
        return this.timeoutCr;
    }

    public void setTimeoutCr(TimeValue value) {
        this.timeoutCr = value;
    }
    
    
    
    @XmlElement(name="TP-CONNECTIONS")
    public TpConnections getTpConnections() {
        return this.tpConnections;
    }

    public void setTpConnections(TpConnections value) {
        this.tpConnections = value;
    }
    
    
    
    @XmlElement(name="TRANSMIT-CANCELLATION")
    public Boolean getTransmitCancellation() {
        return this.transmitCancellation;
    }

    public void setTransmitCancellation(Boolean value) {
        this.transmitCancellation = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}