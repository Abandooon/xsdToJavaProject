package stdgui.data.model.orimodel;
@XmlRootElement(name = "LIN-TP-CONNECTION")
public class LinTpConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TpConnectionIdent ident;
    
    
    
    protected DataPduRef dataPduRef;
    
    
    
    protected Boolean dropNotRequestedNad;
    
    
    
    protected FlowControlRef flowControlRef;
    
    
    
    protected LinTpNSduRef linTpNSduRef;
    
    
    
    protected MulticastRef multicastRef;
    
    
    
    protected ArrayList<ReceiverRef_LinTpConnection> receiverRefs;
    
    
    
    protected TimeValue timeoutAs;
    
    
    
    protected TimeValue timeoutCr;
    
    
    
    protected TimeValue timeoutCs;
    
    
    
    protected TransmitterRef_LinTpConnection transmitterRef;
    
    
    
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
    
    
    
    @XmlElement(name="DATA-PDU-REF")
    public DataPduRef getDataPduRef() {
    return this.dataPduRef;
}

    public void setDataPduRef(DataPduRef value) {
        this.dataPduRef = value;
    }
    
    
    
    @XmlElement(name="DROP-NOT-REQUESTED-NAD")
    public Boolean getDropNotRequestedNad() {
    return this.dropNotRequestedNad;
}

    public void setDropNotRequestedNad(Boolean value) {
        this.dropNotRequestedNad = value;
    }
    
    
    
    @XmlElement(name="FLOW-CONTROL-REF")
    public FlowControlRef getFlowControlRef() {
    return this.flowControlRef;
}

    public void setFlowControlRef(FlowControlRef value) {
        this.flowControlRef = value;
    }
    
    
    
    @XmlElement(name="LIN-TP-N-SDU-REF")
    public LinTpNSduRef getLinTpNSduRef() {
    return this.linTpNSduRef;
}

    public void setLinTpNSduRef(LinTpNSduRef value) {
        this.linTpNSduRef = value;
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
    public ArrayList<ReceiverRef_LinTpConnection> getReceiverRefs() {
    return this.receiverRefs;
}

    public void setReceiverRefs(ArrayList<ReceiverRef_LinTpConnection> value) {
        this.receiverRefs = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-AS")
    public TimeValue getTimeoutAs() {
    return this.timeoutAs;
}

    public void setTimeoutAs(TimeValue value) {
        this.timeoutAs = value;
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
    
    
    
    @XmlElement(name="TRANSMITTER-REF")
    public TransmitterRef_LinTpConnection getTransmitterRef() {
    return this.transmitterRef;
}

    public void setTransmitterRef(TransmitterRef_LinTpConnection value) {
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