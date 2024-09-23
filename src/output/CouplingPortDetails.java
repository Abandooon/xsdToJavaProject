package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CouplingPortDetails {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CouplingPortStructuralElements couplingPortStructuralElements;
    
    
    
    protected EthernetPriorityRegenerations ethernetPriorityRegenerations;
    
    
    
    protected EthernetTrafficClassAssignments ethernetTrafficClassAssignments;
    
    
    
    protected LastEgressSchedulerRef lastEgressSchedulerRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="COUPLING-PORT-STRUCTURAL-ELEMENTS")
    public CouplingPortStructuralElements getCouplingPortStructuralElements() {
        return this.couplingPortStructuralElements;
    }

    public void setCouplingPortStructuralElements(CouplingPortStructuralElements value) {
        this.couplingPortStructuralElements = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-PRIORITY-REGENERATIONS")
    public EthernetPriorityRegenerations getEthernetPriorityRegenerations() {
        return this.ethernetPriorityRegenerations;
    }

    public void setEthernetPriorityRegenerations(EthernetPriorityRegenerations value) {
        this.ethernetPriorityRegenerations = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-TRAFFIC-CLASS-ASSIGNMENTS")
    public EthernetTrafficClassAssignments getEthernetTrafficClassAssignments() {
        return this.ethernetTrafficClassAssignments;
    }

    public void setEthernetTrafficClassAssignments(EthernetTrafficClassAssignments value) {
        this.ethernetTrafficClassAssignments = value;
    }
    
    
    
    @XmlElement(name="LAST-EGRESS-SCHEDULER-REF")
    public LastEgressSchedulerRef getLastEgressSchedulerRef() {
        return this.lastEgressSchedulerRef;
    }

    public void setLastEgressSchedulerRef(LastEgressSchedulerRef value) {
        this.lastEgressSchedulerRef = value;
    }
    
    
}