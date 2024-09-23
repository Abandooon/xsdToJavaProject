package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EventHandler {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected ApplicationEndpointRef applicationEndpointRef;
    
    
    
    protected ConsumedEventGroupRefs consumedEventGroupRefs;
    
    
    
    protected PositiveInteger multicastThreshold;
    
    
    
    protected RoutingGroupRefs routingGroupRefs;
    
    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="APPLICATION-ENDPOINT-REF")
    public ApplicationEndpointRef getApplicationEndpointRef() {
        return this.applicationEndpointRef;
    }

    public void setApplicationEndpointRef(ApplicationEndpointRef value) {
        this.applicationEndpointRef = value;
    }
    
    
    
    @XmlElement(name="CONSUMED-EVENT-GROUP-REFS")
    public ConsumedEventGroupRefs getConsumedEventGroupRefs() {
        return this.consumedEventGroupRefs;
    }

    public void setConsumedEventGroupRefs(ConsumedEventGroupRefs value) {
        this.consumedEventGroupRefs = value;
    }
    
    
    
    @XmlElement(name="MULTICAST-THRESHOLD")
    public PositiveInteger getMulticastThreshold() {
        return this.multicastThreshold;
    }

    public void setMulticastThreshold(PositiveInteger value) {
        this.multicastThreshold = value;
    }
    
    
    
    @XmlElement(name="ROUTING-GROUP-REFS")
    public RoutingGroupRefs getRoutingGroupRefs() {
        return this.routingGroupRefs;
    }

    public void setRoutingGroupRefs(RoutingGroupRefs value) {
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