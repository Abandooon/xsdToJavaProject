package stdgui.data.model.orimodel;
@XmlRootElement(name = "CONTAINED-I-PDU-PROPS")
public class ContainedIPduProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContainedIPduCollectionSemanticsEnum collectionSemantics;
    
    
    
    protected PositiveInteger headerIdLongHeader;
    
    
    
    protected PositiveInteger headerIdShortHeader;
    
    
    
    protected TimeValue timeout;
    
    
    
    protected PduCollectionTriggerEnum trigger;
    
    

    
    
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
    
    
    
    @XmlElement(name="COLLECTION-SEMANTICS")
    public ContainedIPduCollectionSemanticsEnum getCollectionSemantics() {
    return this.collectionSemantics;
}

    public void setCollectionSemantics(ContainedIPduCollectionSemanticsEnum value) {
        this.collectionSemantics = value;
    }
    
    
    
    @XmlElement(name="HEADER-ID-LONG-HEADER")
    public PositiveInteger getHeaderIdLongHeader() {
    return this.headerIdLongHeader;
}

    public void setHeaderIdLongHeader(PositiveInteger value) {
        this.headerIdLongHeader = value;
    }
    
    
    
    @XmlElement(name="HEADER-ID-SHORT-HEADER")
    public PositiveInteger getHeaderIdShortHeader() {
    return this.headerIdShortHeader;
}

    public void setHeaderIdShortHeader(PositiveInteger value) {
        this.headerIdShortHeader = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT")
    public TimeValue getTimeout() {
    return this.timeout;
}

    public void setTimeout(TimeValue value) {
        this.timeout = value;
    }
    
    
    
    @XmlElement(name="TRIGGER")
    public PduCollectionTriggerEnum getTrigger() {
    return this.trigger;
}

    public void setTrigger(PduCollectionTriggerEnum value) {
        this.trigger = value;
    }
    
    
}