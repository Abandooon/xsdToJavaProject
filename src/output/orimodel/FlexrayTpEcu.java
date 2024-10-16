package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-TP-ECU")
public class FlexrayTpEcu {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean cancellation;
    
    
    
    protected TimeValue cycleTimeMainFunction;
    
    
    
    protected EcuInstanceRef ecuInstanceRef;
    
    
    
    protected Boolean fullDuplexEnabled;
    
    
    
    protected Boolean transmitCancellation;
    
    
    
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
    
    
    
    @XmlElement(name="CANCELLATION")
    public Boolean getCancellation() {
    return this.cancellation;
}

    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }
    
    
    
    @XmlElement(name="CYCLE-TIME-MAIN-FUNCTION")
    public TimeValue getCycleTimeMainFunction() {
    return this.cycleTimeMainFunction;
}

    public void setCycleTimeMainFunction(TimeValue value) {
        this.cycleTimeMainFunction = value;
    }
    
    
    
    @XmlElement(name="ECU-INSTANCE-REF")
    public EcuInstanceRef getEcuInstanceRef() {
    return this.ecuInstanceRef;
}

    public void setEcuInstanceRef(EcuInstanceRef value) {
        this.ecuInstanceRef = value;
    }
    
    
    
    @XmlElement(name="FULL-DUPLEX-ENABLED")
    public Boolean getFullDuplexEnabled() {
    return this.fullDuplexEnabled;
}

    public void setFullDuplexEnabled(Boolean value) {
        this.fullDuplexEnabled = value;
    }
    
    
    
    @XmlElement(name="TRANSMIT-CANCELLATION")
    public Boolean getTransmitCancellation() {
    return this.transmitCancellation;
}

    public void setTransmitCancellation(Boolean value) {
        this.transmitCancellation = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}