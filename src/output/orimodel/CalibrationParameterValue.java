package stdgui.data.model.orimodel;
@XmlRootElement(name = "CALIBRATION-PARAMETER-VALUE")
public class CalibrationParameterValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ApplInitValue applInitValue;
    
    
    
    protected ImplInitValue implInitValue;
    
    
    
    protected InitializedParameterRef initializedParameterRef;
    
    
    
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
    
    
    
    @XmlElement(name="APPL-INIT-VALUE")
    public ApplInitValue getApplInitValue() {
    return this.applInitValue;
}

    public void setApplInitValue(ApplInitValue value) {
        this.applInitValue = value;
    }
    
    
    
    @XmlElement(name="IMPL-INIT-VALUE")
    public ImplInitValue getImplInitValue() {
    return this.implInitValue;
}

    public void setImplInitValue(ImplInitValue value) {
        this.implInitValue = value;
    }
    
    
    
    @XmlElement(name="INITIALIZED-PARAMETER-REF")
    public InitializedParameterRef getInitializedParameterRef() {
    return this.initializedParameterRef;
}

    public void setInitializedParameterRef(InitializedParameterRef value) {
        this.initializedParameterRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}