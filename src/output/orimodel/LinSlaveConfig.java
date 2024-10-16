package stdgui.data.model.orimodel;
@XmlRootElement(name = "LIN-SLAVE-CONFIG")
public class LinSlaveConfig {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer configuredNad;
    
    
    
    protected PositiveInteger functionId;
    
    
    
    protected LinSlaveConfigIdent ident;
    
    
    
    protected LinErrorResponse linErrorResponse;
    
    
    
    protected LinSlaveEcuRef linSlaveEcuRef;
    
    
    
    protected String protocolVersion;
    
    
    
    protected PositiveInteger supplierId;
    
    
    
    protected PositiveInteger variantId;
    
    

    
    
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
    
    
    
    @XmlElement(name="IDENT")
    public LinSlaveConfigIdent getIdent() {
    return this.ident;
}

    public void setIdent(LinSlaveConfigIdent value) {
        this.ident = value;
    }
    
    
    
    @XmlElement(name="LIN-ERROR-RESPONSE")
    public LinErrorResponse getLinErrorResponse() {
    return this.linErrorResponse;
}

    public void setLinErrorResponse(LinErrorResponse value) {
        this.linErrorResponse = value;
    }
    
    
    
    @XmlElement(name="LIN-SLAVE-ECU-REF")
    public LinSlaveEcuRef getLinSlaveEcuRef() {
    return this.linSlaveEcuRef;
}

    public void setLinSlaveEcuRef(LinSlaveEcuRef value) {
        this.linSlaveEcuRef = value;
    }
    
    
    
    @XmlElement(name="PROTOCOL-VERSION")
    public String getProtocolVersion() {
    return this.protocolVersion;
}

    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
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
    
    
}