package stdgui.data.model.orimodel;
@XmlRootElement(name = "CAN-COMMUNICATION-CONTROLLER-CONDITIONAL")
public class CanCommunicationControllerConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean wakeUpByControllerSupported;
    
    
    
    protected CanControllerAttributes canControllerAttributes;
    
    
    
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
    
    
    
    @XmlElement(name="WAKE-UP-BY-CONTROLLER-SUPPORTED")
    public Boolean getWakeUpByControllerSupported() {
    return this.wakeUpByControllerSupported;
}

    public void setWakeUpByControllerSupported(Boolean value) {
        this.wakeUpByControllerSupported = value;
    }
    
    
    
    @XmlElement(name="CAN-CONTROLLER-ATTRIBUTES")
    public CanControllerAttributes getCanControllerAttributes() {
    return this.canControllerAttributes;
}

    public void setCanControllerAttributes(CanControllerAttributes value) {
        this.canControllerAttributes = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}