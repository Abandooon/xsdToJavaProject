package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-RELEASED-TRIGGER-POLICY")
public class BswReleasedTriggerPolicy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean enableTakeAddress;
    
    
    
    protected ReleasedTriggerRef releasedTriggerRef;
    
    
    
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
    
    
    
    @XmlElement(name="ENABLE-TAKE-ADDRESS")
    public Boolean getEnableTakeAddress() {
    return this.enableTakeAddress;
}

    public void setEnableTakeAddress(Boolean value) {
        this.enableTakeAddress = value;
    }
    
    
    
    @XmlElement(name="RELEASED-TRIGGER-REF")
    public ReleasedTriggerRef getReleasedTriggerRef() {
    return this.releasedTriggerRef;
}

    public void setReleasedTriggerRef(ReleasedTriggerRef value) {
        this.releasedTriggerRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}