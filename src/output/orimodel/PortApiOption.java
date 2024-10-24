package stdgui.data.model.orimodel;
@XmlRootElement(name = "PORT-API-OPTION")
public class PortApiOption {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean enableTakeAddress;
    
    
    
    protected DataTransformationErrorHandlingEnum errorHandling;
    
    
    
    protected Boolean indirectApi;
    
    
    
    protected ArrayList<PortDefinedArgumentValue> portArgValues;
    
    
    
    protected PortRef portRef;
    
    
    
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
    
    
    
    @XmlElement(name="ERROR-HANDLING")
    public DataTransformationErrorHandlingEnum getErrorHandling() {
    return this.errorHandling;
}

    public void setErrorHandling(DataTransformationErrorHandlingEnum value) {
        this.errorHandling = value;
    }
    
    
    
    @XmlElement(name="INDIRECT-API")
    public Boolean getIndirectApi() {
    return this.indirectApi;
}

    public void setIndirectApi(Boolean value) {
        this.indirectApi = value;
    }
    
    
    
    @XmlElementWrapper(name="PORT-ARG-VALUES")
@XmlElement(name="PORT-DEFINED-ARGUMENT-VALUE")
    public ArrayList<PortDefinedArgumentValue> getPortArgValues() {
    return this.portArgValues;
}

    public void setPortArgValues(ArrayList<PortDefinedArgumentValue> value) {
        this.portArgValues = value;
    }
    
    
    
    @XmlElement(name="PORT-REF")
    public PortRef getPortRef() {
    return this.portRef;
}

    public void setPortRef(PortRef value) {
        this.portRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}