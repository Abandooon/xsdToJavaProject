package stdgui.data.model.orimodel;
@XmlRootElement(name = "CAN-TP-ECU")
public class CanTpEcu {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TimeValue cycleTimeMainFunction;
    
    
    
    protected EcuInstanceRef ecuInstanceRef;
    
    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}