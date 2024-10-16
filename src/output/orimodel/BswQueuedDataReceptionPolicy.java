package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-QUEUED-DATA-RECEPTION-POLICY")
public class BswQueuedDataReceptionPolicy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean enableTakeAddress;
    
    
    
    protected ReceivedDataRef receivedDataRef;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected PositiveInteger queueLength;
    
    

    
    
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
    
    
    
    @XmlElement(name="ENABLE-TAKE-ADDRESS")
    public Boolean getEnableTakeAddress() {
    return this.enableTakeAddress;
}

    public void setEnableTakeAddress(Boolean value) {
        this.enableTakeAddress = value;
    }
    
    
    
    @XmlElement(name="RECEIVED-DATA-REF")
    public ReceivedDataRef getReceivedDataRef() {
    return this.receivedDataRef;
}

    public void setReceivedDataRef(ReceivedDataRef value) {
        this.receivedDataRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="QUEUE-LENGTH")
    public PositiveInteger getQueueLength() {
    return this.queueLength;
}

    public void setQueueLength(PositiveInteger value) {
        this.queueLength = value;
    }
    
    
}