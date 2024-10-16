package stdgui.data.model.orimodel;
@XmlRootElement(name = "UDP-NM-CLUSTER-COUPLING")
public class UdpNmClusterCoupling {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<CoupledClusterRef_UdpNmClusterCoupling> coupledClusterRefs;
    
    
    
    protected Boolean nmBusLoadReductionEnabled;
    
    
    
    protected Boolean nmImmediateRestartEnabled;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElementWrapper(name="COUPLED-CLUSTER-REFS")
@XmlElement(name="COUPLED-CLUSTER-REF")
    public ArrayList<CoupledClusterRef_UdpNmClusterCoupling> getCoupledClusterRefs() {
    return this.coupledClusterRefs;
}

    public void setCoupledClusterRefs(ArrayList<CoupledClusterRef_UdpNmClusterCoupling> value) {
        this.coupledClusterRefs = value;
    }
    
    
    
    @XmlElement(name="NM-BUS-LOAD-REDUCTION-ENABLED")
    public Boolean getNmBusLoadReductionEnabled() {
    return this.nmBusLoadReductionEnabled;
}

    public void setNmBusLoadReductionEnabled(Boolean value) {
        this.nmBusLoadReductionEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-IMMEDIATE-RESTART-ENABLED")
    public Boolean getNmImmediateRestartEnabled() {
    return this.nmImmediateRestartEnabled;
}

    public void setNmImmediateRestartEnabled(Boolean value) {
        this.nmImmediateRestartEnabled = value;
    }
    
    
}