package stdgui.data.model.orimodel;
@XmlRootElement(name = "EVENT-HANDLER")
public class EventHandler {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected ApplicationEndpointRef applicationEndpointRef;
    
    
    
    protected ArrayList<ConsumedEventGroupRef> consumedEventGroupRefs;
    
    
    
    protected PositiveInteger multicastThreshold;
    
    
    
    protected ArrayList<RoutingGroupRef> routingGroupRefs;
    
    
    
    protected SdServerConfig sdServerConfig;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="APPLICATION-ENDPOINT-REF")
    public ApplicationEndpointRef getApplicationEndpointRef() {
    return this.applicationEndpointRef;
}

    public void setApplicationEndpointRef(ApplicationEndpointRef value) {
        this.applicationEndpointRef = value;
    }
    
    
    
    @XmlElementWrapper(name="CONSUMED-EVENT-GROUP-REFS")
@XmlElement(name="CONSUMED-EVENT-GROUP-REF")
    public ArrayList<ConsumedEventGroupRef> getConsumedEventGroupRefs() {
    return this.consumedEventGroupRefs;
}

    public void setConsumedEventGroupRefs(ArrayList<ConsumedEventGroupRef> value) {
        this.consumedEventGroupRefs = value;
    }
    
    
    
    @XmlElement(name="MULTICAST-THRESHOLD")
    public PositiveInteger getMulticastThreshold() {
    return this.multicastThreshold;
}

    public void setMulticastThreshold(PositiveInteger value) {
        this.multicastThreshold = value;
    }
    
    
    
    @XmlElementWrapper(name="ROUTING-GROUP-REFS")
@XmlElement(name="ROUTING-GROUP-REF")
    public ArrayList<RoutingGroupRef> getRoutingGroupRefs() {
    return this.routingGroupRefs;
}

    public void setRoutingGroupRefs(ArrayList<RoutingGroupRef> value) {
        this.routingGroupRefs = value;
    }
    
    
    
    @XmlElement(name="SD-SERVER-CONFIG")
    public SdServerConfig getSdServerConfig() {
    return this.sdServerConfig;
}

    public void setSdServerConfig(SdServerConfig value) {
        this.sdServerConfig = value;
    }
    
    
}