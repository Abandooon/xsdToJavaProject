package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-TP-CONNECTION")
public class FlexrayTpConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TpConnectionIdent ident;
    
    
    
    protected Boolean bandwidthLimitation;
    
    
    
    protected DirectTpSduRef directTpSduRef;
    
    
    
    protected MulticastRef multicastRef;
    
    
    
    protected ArrayList<ReceiverRef_FlexrayTpConnection> receiverRefs;
    
    
    
    protected ReversedTpSduRef reversedTpSduRef;
    
    
    
    protected RxPduPoolRef rxPduPoolRef;
    
    
    
    protected TpConnectionControlRef tpConnectionControlRef;
    
    
    
    protected TransmitterRef_FlexrayTpConnection transmitterRef;
    
    
    
    protected TxPduPoolRef txPduPoolRef;
    
    
    
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
    
    
    
    @XmlElement(name="BANDWIDTH-LIMITATION")
    public Boolean getBandwidthLimitation() {
    return this.bandwidthLimitation;
}

    public void setBandwidthLimitation(Boolean value) {
        this.bandwidthLimitation = value;
    }
    
    
    
    @XmlElement(name="DIRECT-TP-SDU-REF")
    public DirectTpSduRef getDirectTpSduRef() {
    return this.directTpSduRef;
}

    public void setDirectTpSduRef(DirectTpSduRef value) {
        this.directTpSduRef = value;
    }
    
    
    
    @XmlElement(name="MULTICAST-REF")
    public MulticastRef getMulticastRef() {
    return this.multicastRef;
}

    public void setMulticastRef(MulticastRef value) {
        this.multicastRef = value;
    }
    
    
    
    @XmlElementWrapper(name="RECEIVER-REFS")
@XmlElement(name="RECEIVER-REF")
    public ArrayList<ReceiverRef_FlexrayTpConnection> getReceiverRefs() {
    return this.receiverRefs;
}

    public void setReceiverRefs(ArrayList<ReceiverRef_FlexrayTpConnection> value) {
        this.receiverRefs = value;
    }
    
    
    
    @XmlElement(name="REVERSED-TP-SDU-REF")
    public ReversedTpSduRef getReversedTpSduRef() {
    return this.reversedTpSduRef;
}

    public void setReversedTpSduRef(ReversedTpSduRef value) {
        this.reversedTpSduRef = value;
    }
    
    
    
    @XmlElement(name="RX-PDU-POOL-REF")
    public RxPduPoolRef getRxPduPoolRef() {
    return this.rxPduPoolRef;
}

    public void setRxPduPoolRef(RxPduPoolRef value) {
        this.rxPduPoolRef = value;
    }
    
    
    
    @XmlElement(name="TP-CONNECTION-CONTROL-REF")
    public TpConnectionControlRef getTpConnectionControlRef() {
    return this.tpConnectionControlRef;
}

    public void setTpConnectionControlRef(TpConnectionControlRef value) {
        this.tpConnectionControlRef = value;
    }
    
    
    
    @XmlElement(name="TRANSMITTER-REF")
    public TransmitterRef_FlexrayTpConnection getTransmitterRef() {
    return this.transmitterRef;
}

    public void setTransmitterRef(TransmitterRef_FlexrayTpConnection value) {
        this.transmitterRef = value;
    }
    
    
    
    @XmlElement(name="TX-PDU-POOL-REF")
    public TxPduPoolRef getTxPduPoolRef() {
    return this.txPduPoolRef;
}

    public void setTxPduPoolRef(TxPduPoolRef value) {
        this.txPduPoolRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}