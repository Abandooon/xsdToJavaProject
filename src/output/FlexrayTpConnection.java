package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FlexrayTpConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TpConnectionIdent ident;
    
    
    
    protected Boolean bandwidthLimitation;
    
    
    
    protected DirectTpSduRef directTpSduRef;
    
    
    
    protected MulticastRef multicastRef;
    
    
    
    protected ReceiverRefs receiverRefs;
    
    
    
    protected ReversedTpSduRef reversedTpSduRef;
    
    
    
    protected RxPduPoolRef rxPduPoolRef;
    
    
    
    protected TpConnectionControlRef tpConnectionControlRef;
    
    
    
    protected TransmitterRef transmitterRef;
    
    
    
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
    
    
    
    @XmlElement(name="RECEIVER-REFS")
    public ReceiverRefs getReceiverRefs() {
        return this.receiverRefs;
    }

    public void setReceiverRefs(ReceiverRefs value) {
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
    public TransmitterRef getTransmitterRef() {
        return this.transmitterRef;
    }

    public void setTransmitterRef(TransmitterRef value) {
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