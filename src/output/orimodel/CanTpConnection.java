package stdgui.data.model.orimodel;
@XmlRootElement(name = "CAN-TP-CONNECTION")
public class CanTpConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TpConnectionIdent ident;
    
    
    
    protected CanTpAddressingFormatType addressingFormat;
    
    
    
    protected CanTpChannelRef canTpChannelRef;
    
    
    
    protected Boolean cancellation;
    
    
    
    protected DataPduRef dataPduRef;
    
    
    
    protected FlowControlPduRef flowControlPduRef;
    
    
    
    protected Integer maxBlockSize;
    
    
    
    protected MulticastRef_CanTpConnection multicastRef;
    
    
    
    protected Boolean paddingActivation;
    
    
    
    protected ArrayList<ReceiverRef> receiverRefs;
    
    
    
    protected NetworkTargetAddressType taType;
    
    
    
    protected TimeValue timeoutBr;
    
    
    
    protected TimeValue timeoutBs;
    
    
    
    protected TimeValue timeoutCr;
    
    
    
    protected TimeValue timeoutCs;
    
    
    
    protected TpSduRef_CanTpConnection tpSduRef;
    
    
    
    protected Boolean transmitCancellation;
    
    
    
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
    
    
    
    @XmlElement(name="ADDRESSING-FORMAT")
    public CanTpAddressingFormatType getAddressingFormat() {
    return this.addressingFormat;
}

    public void setAddressingFormat(CanTpAddressingFormatType value) {
        this.addressingFormat = value;
    }
    
    
    
    @XmlElement(name="CAN-TP-CHANNEL-REF")
    public CanTpChannelRef getCanTpChannelRef() {
    return this.canTpChannelRef;
}

    public void setCanTpChannelRef(CanTpChannelRef value) {
        this.canTpChannelRef = value;
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
    
    
    
    @XmlElement(name="FLOW-CONTROL-PDU-REF")
    public FlowControlPduRef getFlowControlPduRef() {
    return this.flowControlPduRef;
}

    public void setFlowControlPduRef(FlowControlPduRef value) {
        this.flowControlPduRef = value;
    }
    
    
    
    @XmlElement(name="MAX-BLOCK-SIZE")
    public Integer getMaxBlockSize() {
    return this.maxBlockSize;
}

    public void setMaxBlockSize(Integer value) {
        this.maxBlockSize = value;
    }
    
    
    
    @XmlElement(name="MULTICAST-REF")
    public MulticastRef_CanTpConnection getMulticastRef() {
    return this.multicastRef;
}

    public void setMulticastRef(MulticastRef_CanTpConnection value) {
        this.multicastRef = value;
    }
    
    
    
    @XmlElement(name="PADDING-ACTIVATION")
    public Boolean getPaddingActivation() {
    return this.paddingActivation;
}

    public void setPaddingActivation(Boolean value) {
        this.paddingActivation = value;
    }
    
    
    
    @XmlElementWrapper(name="RECEIVER-REFS")
@XmlElement(name="RECEIVER-REF")
    public ArrayList<ReceiverRef> getReceiverRefs() {
    return this.receiverRefs;
}

    public void setReceiverRefs(ArrayList<ReceiverRef> value) {
        this.receiverRefs = value;
    }
    
    
    
    @XmlElement(name="TA-TYPE")
    public NetworkTargetAddressType getTaType() {
    return this.taType;
}

    public void setTaType(NetworkTargetAddressType value) {
        this.taType = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-BR")
    public TimeValue getTimeoutBr() {
    return this.timeoutBr;
}

    public void setTimeoutBr(TimeValue value) {
        this.timeoutBr = value;
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
    
    
    
    @XmlElement(name="TIMEOUT-CS")
    public TimeValue getTimeoutCs() {
    return this.timeoutCs;
}

    public void setTimeoutCs(TimeValue value) {
        this.timeoutCs = value;
    }
    
    
    
    @XmlElement(name="TP-SDU-REF")
    public TpSduRef_CanTpConnection getTpSduRef() {
    return this.tpSduRef;
}

    public void setTpSduRef(TpSduRef_CanTpConnection value) {
        this.tpSduRef = value;
    }
    
    
    
    @XmlElement(name="TRANSMIT-CANCELLATION")
    public Boolean getTransmitCancellation() {
    return this.transmitCancellation;
}

    public void setTransmitCancellation(Boolean value) {
        this.transmitCancellation = value;
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