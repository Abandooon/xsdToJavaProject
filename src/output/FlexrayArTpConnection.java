package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

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
    
    
    
    protected TargetRefs targetRefs;
    
    
    
    protected TransmitPduRefs transmitPduRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="TARGET-REFS")
    public TargetRefs getTargetRefs() {
        return this.targetRefs;
    }

    public void setTargetRefs(TargetRefs value) {
        this.targetRefs = value;
    }
    
    
    
    @XmlElement(name="TRANSMIT-PDU-REFS")
    public TransmitPduRefs getTransmitPduRefs() {
        return this.transmitPduRefs;
    }

    public void setTransmitPduRefs(TransmitPduRefs value) {
        this.transmitPduRefs = value;
    }
    
    
}