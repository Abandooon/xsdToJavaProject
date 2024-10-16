package stdgui.data.model.orimodel;
@XmlRootElement(name = "SD-CLIENT-CONFIG")
public class SdClientConfig {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<TagWithOptionalValue> capabilityRecords;
    
    
    
    protected PositiveInteger clientServiceMajorVersion;
    
    
    
    protected PositiveInteger clientServiceMinorVersion;
    
    
    
    protected InitialSdDelayConfig initialFindBehavior;
    
    
    
    protected RequestResponseDelay requestResponseDelay;
    
    
    
    protected PositiveInteger ttl;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="CAPABILITY-RECORDS")
@XmlElement(name="TAG-WITH-OPTIONAL-VALUE")
    public ArrayList<TagWithOptionalValue> getCapabilityRecords() {
    return this.capabilityRecords;
}

    public void setCapabilityRecords(ArrayList<TagWithOptionalValue> value) {
        this.capabilityRecords = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVICE-MAJOR-VERSION")
    public PositiveInteger getClientServiceMajorVersion() {
    return this.clientServiceMajorVersion;
}

    public void setClientServiceMajorVersion(PositiveInteger value) {
        this.clientServiceMajorVersion = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVICE-MINOR-VERSION")
    public PositiveInteger getClientServiceMinorVersion() {
    return this.clientServiceMinorVersion;
}

    public void setClientServiceMinorVersion(PositiveInteger value) {
        this.clientServiceMinorVersion = value;
    }
    
    
    
    @XmlElement(name="INITIAL-FIND-BEHAVIOR")
    public InitialSdDelayConfig getInitialFindBehavior() {
    return this.initialFindBehavior;
}

    public void setInitialFindBehavior(InitialSdDelayConfig value) {
        this.initialFindBehavior = value;
    }
    
    
    
    @XmlElement(name="REQUEST-RESPONSE-DELAY")
    public RequestResponseDelay getRequestResponseDelay() {
    return this.requestResponseDelay;
}

    public void setRequestResponseDelay(RequestResponseDelay value) {
        this.requestResponseDelay = value;
    }
    
    
    
    @XmlElement(name="TTL")
    public PositiveInteger getTtl() {
    return this.ttl;
}

    public void setTtl(PositiveInteger value) {
        this.ttl = value;
    }
    
    
}