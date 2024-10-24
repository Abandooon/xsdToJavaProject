package stdgui.data.model.orimodel;
@XmlRootElement(name = "SOCKET-CONNECTION-IPDU-IDENTIFIER")
public class SocketConnectionIpduIdentifier {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger headerId;
    
    
    
    protected TimeValue pduCollectionPduTimeout;
    
    
    
    protected PduCollectionTriggerEnum pduCollectionTrigger;
    
    
    
    protected PduRef pduRef;
    
    
    
    protected PduTriggeringRef pduTriggeringRef;
    
    
    
    protected ArrayList<RoutingGroupRef> routingGroupRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="HEADER-ID")
    public PositiveInteger getHeaderId() {
    return this.headerId;
}

    public void setHeaderId(PositiveInteger value) {
        this.headerId = value;
    }
    
    
    
    @XmlElement(name="PDU-COLLECTION-PDU-TIMEOUT")
    public TimeValue getPduCollectionPduTimeout() {
    return this.pduCollectionPduTimeout;
}

    public void setPduCollectionPduTimeout(TimeValue value) {
        this.pduCollectionPduTimeout = value;
    }
    
    
    
    @XmlElement(name="PDU-COLLECTION-TRIGGER")
    public PduCollectionTriggerEnum getPduCollectionTrigger() {
    return this.pduCollectionTrigger;
}

    public void setPduCollectionTrigger(PduCollectionTriggerEnum value) {
        this.pduCollectionTrigger = value;
    }
    
    
    
    @XmlElement(name="PDU-REF")
    public PduRef getPduRef() {
    return this.pduRef;
}

    public void setPduRef(PduRef value) {
        this.pduRef = value;
    }
    
    
    
    @XmlElement(name="PDU-TRIGGERING-REF")
    public PduTriggeringRef getPduTriggeringRef() {
    return this.pduTriggeringRef;
}

    public void setPduTriggeringRef(PduTriggeringRef value) {
        this.pduTriggeringRef = value;
    }
    
    
    
    @XmlElementWrapper(name="ROUTING-GROUP-REFS")
@XmlElement(name="ROUTING-GROUP-REF")
    public ArrayList<RoutingGroupRef> getRoutingGroupRefs() {
    return this.routingGroupRefs;
}

    public void setRoutingGroupRefs(ArrayList<RoutingGroupRef> value) {
        this.routingGroupRefs = value;
    }
    
    
}