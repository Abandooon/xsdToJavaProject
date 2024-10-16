package stdgui.data.model.orimodel;
@XmlRootElement(name = "DATA-TRANSFORMATION-REF-CONDITIONAL")
public class DataTransformationRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DataTransformationRef dataTransformationRef;
    
    
    
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
    
    
    
    @XmlElement(name="DATA-TRANSFORMATION-REF")
    public DataTransformationRef getDataTransformationRef() {
    return this.dataTransformationRef;
}

    public void setDataTransformationRef(DataTransformationRef value) {
        this.dataTransformationRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}