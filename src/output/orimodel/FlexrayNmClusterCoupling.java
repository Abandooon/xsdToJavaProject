package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-NM-CLUSTER-COUPLING")
public class FlexrayNmClusterCoupling {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<CoupledClusterRef_FlexrayNmClusterCoupling> coupledClusterRefs;
    
    
    
    protected Boolean nmControlBitVectorEnabled;
    
    
    
    protected Boolean nmDataDisabled;
    
    
    
    protected FlexrayNmScheduleVariant nmScheduleVariant;
    
    

    
    
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
    public ArrayList<CoupledClusterRef_FlexrayNmClusterCoupling> getCoupledClusterRefs() {
    return this.coupledClusterRefs;
}

    public void setCoupledClusterRefs(ArrayList<CoupledClusterRef_FlexrayNmClusterCoupling> value) {
        this.coupledClusterRefs = value;
    }
    
    
    
    @XmlElement(name="NM-CONTROL-BIT-VECTOR-ENABLED")
    public Boolean getNmControlBitVectorEnabled() {
    return this.nmControlBitVectorEnabled;
}

    public void setNmControlBitVectorEnabled(Boolean value) {
        this.nmControlBitVectorEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-DATA-DISABLED")
    public Boolean getNmDataDisabled() {
    return this.nmDataDisabled;
}

    public void setNmDataDisabled(Boolean value) {
        this.nmDataDisabled = value;
    }
    
    
    
    @XmlElement(name="NM-SCHEDULE-VARIANT")
    public FlexrayNmScheduleVariant getNmScheduleVariant() {
    return this.nmScheduleVariant;
}

    public void setNmScheduleVariant(FlexrayNmScheduleVariant value) {
        this.nmScheduleVariant = value;
    }
    
    
}