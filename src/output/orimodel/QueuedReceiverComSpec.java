package stdgui.data.model.orimodel;
@XmlRootElement(name = "QUEUED-RECEIVER-COM-SPEC")
public class QueuedReceiverComSpec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<CompositeNetworkRepresentation> compositeNetworkRepresentations;
    
    
    
    protected DataElementRef_InvalidationPolicy dataElementRef;
    
    
    
    protected ExternalReplacementRef externalReplacementRef;
    
    
    
    protected HandleOutOfRangeEnum handleOutOfRange;
    
    
    
    protected HandleOutOfRangeStatusEnum handleOutOfRangeStatus;
    
    
    
    protected PositiveIntegerValueVariationPoint maxDeltaCounterInit;
    
    
    
    protected PositiveInteger maxNoNewOrRepeatedData;
    
    
    
    protected SwDataDefProps networkRepresentation;
    
    
    
    protected VariableAccess replaceWith;
    
    
    
    protected PositiveInteger syncCounterInit;
    
    
    
    protected TransformationComSpecPropss transformationComSpecPropss;
    
    
    
    protected BooleanValueVariationPoint usesEndToEndProtection;
    
    
    
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
    
    
    
    @XmlElement(name="EXTERNAL-REPLACEMENT-REF")
    public ExternalReplacementRef getExternalReplacementRef() {
    return this.externalReplacementRef;
}

    public void setExternalReplacementRef(ExternalReplacementRef value) {
        this.externalReplacementRef = value;
    }
    
    
    
    @XmlElement(name="HANDLE-OUT-OF-RANGE")
    public HandleOutOfRangeEnum getHandleOutOfRange() {
    return this.handleOutOfRange;
}

    public void setHandleOutOfRange(HandleOutOfRangeEnum value) {
        this.handleOutOfRange = value;
    }
    
    
    
    @XmlElement(name="HANDLE-OUT-OF-RANGE-STATUS")
    public HandleOutOfRangeStatusEnum getHandleOutOfRangeStatus() {
    return this.handleOutOfRangeStatus;
}

    public void setHandleOutOfRangeStatus(HandleOutOfRangeStatusEnum value) {
        this.handleOutOfRangeStatus = value;
    }
    
    
    
    @XmlElement(name="MAX-DELTA-COUNTER-INIT")
    public PositiveIntegerValueVariationPoint getMaxDeltaCounterInit() {
    return this.maxDeltaCounterInit;
}

    public void setMaxDeltaCounterInit(PositiveIntegerValueVariationPoint value) {
        this.maxDeltaCounterInit = value;
    }
    
    
    
    @XmlElement(name="MAX-NO-NEW-OR-REPEATED-DATA")
    public PositiveInteger getMaxNoNewOrRepeatedData() {
    return this.maxNoNewOrRepeatedData;
}

    public void setMaxNoNewOrRepeatedData(PositiveInteger value) {
        this.maxNoNewOrRepeatedData = value;
    }
    
    
    
    @XmlElement(name="NETWORK-REPRESENTATION")
    public SwDataDefProps getNetworkRepresentation() {
    return this.networkRepresentation;
}

    public void setNetworkRepresentation(SwDataDefProps value) {
        this.networkRepresentation = value;
    }
    
    
    
    @XmlElement(name="REPLACE-WITH")
    public VariableAccess getReplaceWith() {
    return this.replaceWith;
}

    public void setReplaceWith(VariableAccess value) {
        this.replaceWith = value;
    }
    
    
    
    @XmlElement(name="SYNC-COUNTER-INIT")
    public PositiveInteger getSyncCounterInit() {
    return this.syncCounterInit;
}

    public void setSyncCounterInit(PositiveInteger value) {
        this.syncCounterInit = value;
    }
    
    
    
    @XmlElement(name="TRANSFORMATION-COM-SPEC-PROPSS")
    public TransformationComSpecPropss getTransformationComSpecPropss() {
    return this.transformationComSpecPropss;
}

    public void setTransformationComSpecPropss(TransformationComSpecPropss value) {
        this.transformationComSpecPropss = value;
    }
    
    
    
    @XmlElement(name="USES-END-TO-END-PROTECTION")
    public BooleanValueVariationPoint getUsesEndToEndProtection() {
    return this.usesEndToEndProtection;
}

    public void setUsesEndToEndProtection(BooleanValueVariationPoint value) {
        this.usesEndToEndProtection = value;
    }
    
    
    
    @XmlElement(name="QUEUE-LENGTH")
    public PositiveInteger getQueueLength() {
    return this.queueLength;
}

    public void setQueueLength(PositiveInteger value) {
        this.queueLength = value;
    }
    
    
}