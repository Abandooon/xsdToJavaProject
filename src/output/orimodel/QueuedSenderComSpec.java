package stdgui.data.model.orimodel;
@XmlRootElement(name = "QUEUED-SENDER-COM-SPEC")
public class QueuedSenderComSpec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<CompositeNetworkRepresentation> compositeNetworkRepresentations;
    
    
    
    protected DataElementRef_InvalidationPolicy dataElementRef;
    
    
    
    protected HandleOutOfRangeEnum handleOutOfRange;
    
    
    
    protected SwDataDefProps networkRepresentation;
    
    
    
    protected TransmissionAcknowledgementRequest transmissionAcknowledge;
    
    
    
    protected BooleanValueVariationPoint usesEndToEndProtection;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="COMPOSITE-NETWORK-REPRESENTATIONS")
@XmlElement(name="COMPOSITE-NETWORK-REPRESENTATION")
    public ArrayList<CompositeNetworkRepresentation> getCompositeNetworkRepresentations() {
    return this.compositeNetworkRepresentations;
}

    public void setCompositeNetworkRepresentations(ArrayList<CompositeNetworkRepresentation> value) {
        this.compositeNetworkRepresentations = value;
    }
    
    
    
    @XmlElement(name="DATA-ELEMENT-REF")
    public DataElementRef_InvalidationPolicy getDataElementRef() {
    return this.dataElementRef;
}

    public void setDataElementRef(DataElementRef_InvalidationPolicy value) {
        this.dataElementRef = value;
    }
    
    
    
    @XmlElement(name="HANDLE-OUT-OF-RANGE")
    public HandleOutOfRangeEnum getHandleOutOfRange() {
    return this.handleOutOfRange;
}

    public void setHandleOutOfRange(HandleOutOfRangeEnum value) {
        this.handleOutOfRange = value;
    }
    
    
    
    @XmlElement(name="NETWORK-REPRESENTATION")
    public SwDataDefProps getNetworkRepresentation() {
    return this.networkRepresentation;
}

    public void setNetworkRepresentation(SwDataDefProps value) {
        this.networkRepresentation = value;
    }
    
    
    
    @XmlElement(name="TRANSMISSION-ACKNOWLEDGE")
    public TransmissionAcknowledgementRequest getTransmissionAcknowledge() {
    return this.transmissionAcknowledge;
}

    public void setTransmissionAcknowledge(TransmissionAcknowledgementRequest value) {
        this.transmissionAcknowledge = value;
    }
    
    
    
    @XmlElement(name="USES-END-TO-END-PROTECTION")
    public BooleanValueVariationPoint getUsesEndToEndProtection() {
    return this.usesEndToEndProtection;
}

    public void setUsesEndToEndProtection(BooleanValueVariationPoint value) {
        this.usesEndToEndProtection = value;
    }
    
    
}