package stdgui.data.model.orimodel;
@XmlRootElement(name = "SIGNAL-I-PDU-REPLICATION")
public class SignalIPduReplication {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer pduReplicationVoting;
    
    
    
    protected ArrayList<ReplicaPdusRef> replicaPdusRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="PDU-REPLICATION-VOTING")
    public Integer getPduReplicationVoting() {
    return this.pduReplicationVoting;
}

    public void setPduReplicationVoting(Integer value) {
        this.pduReplicationVoting = value;
    }
    
    
    
    @XmlElementWrapper(name="REPLICA-PDUS-REFS")
@XmlElement(name="REPLICA-PDUS-REF")
    public ArrayList<ReplicaPdusRef> getReplicaPdusRefs() {
    return this.replicaPdusRefs;
}

    public void setReplicaPdusRefs(ArrayList<ReplicaPdusRef> value) {
        this.replicaPdusRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}