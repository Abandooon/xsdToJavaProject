package stdgui.data.model.orimodel;
@XmlRootElement(name = "LIN-SLAVE-CONDITIONAL")
public class LinSlaveConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean wakeUpByControllerSupported;
    
    
    
    protected String protocolVersion;
    
    
    
    protected Integer configuredNad;
    
    
    
    protected PositiveInteger functionId;
    
    
    
    protected LinErrorResponse linErrorResponse;
    
    
    
    protected PositiveInteger supplierId;
    
    
    
    protected PositiveInteger variantId;
    
    
    
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
    
    
    
    @XmlElement(name="PROTOCOL-VERSION")
    public String getProtocolVersion() {
    return this.protocolVersion;
}

    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
    }
    
    
    
    @XmlElement(name="CONFIGURED-NAD")
    public Integer getConfiguredNad() {
    return this.configuredNad;
}

    public void setConfiguredNad(Integer value) {
        this.configuredNad = value;
    }
    
    
    
    @XmlElement(name="FUNCTION-ID")
    public PositiveInteger getFunctionId() {
    return this.functionId;
}

    public void setFunctionId(PositiveInteger value) {
        this.functionId = value;
    }
    
    
    
    @XmlElement(name="LIN-ERROR-RESPONSE")
    public LinErrorResponse getLinErrorResponse() {
    return this.linErrorResponse;
}

    public void setLinErrorResponse(LinErrorResponse value) {
        this.linErrorResponse = value;
    }
    
    
    
    @XmlElement(name="SUPPLIER-ID")
    public PositiveInteger getSupplierId() {
    return this.supplierId;
}

    public void setSupplierId(PositiveInteger value) {
        this.supplierId = value;
    }
    
    
    
    @XmlElement(name="VARIANT-ID")
    public PositiveInteger getVariantId() {
    return this.variantId;
}

    public void setVariantId(PositiveInteger value) {
        this.variantId = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}