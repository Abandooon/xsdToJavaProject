package stdgui.data.model.orimodel;
@XmlRootElement(name = "FIBEX-ELEMENT-REF-CONDITIONAL")
public class FibexElementRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FibexElementRef fibexElementRef;
    
    
    
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
    
    
    
    @XmlElement(name="FIBEX-ELEMENT-REF")
    public FibexElementRef getFibexElementRef() {
    return this.fibexElementRef;
}

    public void setFibexElementRef(FibexElementRef value) {
        this.fibexElementRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}