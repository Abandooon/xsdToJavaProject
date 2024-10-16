package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-AR-TP-CONNECTION")
public class FlexrayArTpConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TpConnectionIdent ident;
    
    
    
    protected Integer connectionPrioPdus;
    
    
    
    protected DirectTpSduRef directTpSduRef;
    
    
    
    protected FlowControlPduRef flowControlPduRef;
    
    
    
    protected MulticastRef multicastRef;
    
    
    
    protected ReversedTpSduRef reversedTpSduRef;
    
    
    
    protected SourceRef sourceRef;
    
    
    
    protected ArrayList<TargetRef_FlexrayArTpConnection> targetRefs;
    
    
    
    protected ArrayList<TransmitPduRef> transmitPduRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONNECTION-PRIO-PDUS")
    public Integer getConnectionPrioPdus() {
    return this.connectionPrioPdus;
}

    public void setConnectionPrioPdus(Integer value) {
        this.connectionPrioPdus = value;
    }
    
    
    
    @XmlElement(name="DIRECT-TP-SDU-REF")
    public DirectTpSduRef getDirectTpSduRef() {
    return this.directTpSduRef;
}

    public void setDirectTpSduRef(DirectTpSduRef value) {
        this.directTpSduRef = value;
    }
    
    
    
    @XmlElement(name="FLOW-CONTROL-PDU-REF")
    public FlowControlPduRef getFlowControlPduRef() {
    return this.flowControlPduRef;
}

    public void setFlowControlPduRef(FlowControlPduRef value) {
        this.flowControlPduRef = value;
    }
    
    
    
    @XmlElement(name="MULTICAST-REF")
    public MulticastRef getMulticastRef() {
    return this.multicastRef;
}

    public void setMulticastRef(MulticastRef value) {
        this.multicastRef = value;
    }
    
    
    
    @XmlElement(name="REVERSED-TP-SDU-REF")
    public ReversedTpSduRef getReversedTpSduRef() {
    return this.reversedTpSduRef;
}

    public void setReversedTpSduRef(ReversedTpSduRef value) {
        this.reversedTpSduRef = value;
    }
    
    
    
    @XmlElement(name="SOURCE-REF")
    public SourceRef getSourceRef() {
    return this.sourceRef;
}

    public void setSourceRef(SourceRef value) {
        this.sourceRef = value;
    }
    
    
    
    @XmlElementWrapper(name="TARGET-REFS")
@XmlElement(name="TARGET-REF")
    public ArrayList<TargetRef_FlexrayArTpConnection> getTargetRefs() {
    return this.targetRefs;
}

    public void setTargetRefs(ArrayList<TargetRef_FlexrayArTpConnection> value) {
        this.targetRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="TRANSMIT-PDU-REFS")
@XmlElement(name="TRANSMIT-PDU-REF")
    public ArrayList<TransmitPduRef> getTransmitPduRefs() {
    return this.transmitPduRefs;
}

    public void setTransmitPduRefs(ArrayList<TransmitPduRef> value) {
        this.transmitPduRefs = value;
    }
    
    
}