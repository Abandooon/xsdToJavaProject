package stdgui.data.model.orimodel;
@XmlRootElement(name = "COUPLING-PORT-DETAILS")
public class CouplingPortDetails {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CouplingPortStructuralElements couplingPortStructuralElements;
    
    
    
    protected ArrayList<EthernetPriorityRegeneration> ethernetPriorityRegenerations;
    
    
    
    protected ArrayList<CouplingPortTrafficClassAssignment> ethernetTrafficClassAssignments;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="ETHERNET-PRIORITY-REGENERATIONS")
@XmlElement(name="ETHERNET-PRIORITY-REGENERATION")
    public ArrayList<EthernetPriorityRegeneration> getEthernetPriorityRegenerations() {
    return this.ethernetPriorityRegenerations;
}

    public void setEthernetPriorityRegenerations(ArrayList<EthernetPriorityRegeneration> value) {
        this.ethernetPriorityRegenerations = value;
    }
    
    
    
    @XmlElementWrapper(name="ETHERNET-TRAFFIC-CLASS-ASSIGNMENTS")
@XmlElement(name="COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT")
    public ArrayList<CouplingPortTrafficClassAssignment> getEthernetTrafficClassAssignments() {
    return this.ethernetTrafficClassAssignments;
}

    public void setEthernetTrafficClassAssignments(ArrayList<CouplingPortTrafficClassAssignment> value) {
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