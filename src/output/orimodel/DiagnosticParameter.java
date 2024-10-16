package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-PARAMETER")
public class DiagnosticParameter {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger bitOffset;
    
    
    
    protected ArrayList<DiagnosticDataElement> dataElements;
    
    
    
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
    
    
    
    @XmlElement(name="BIT-OFFSET")
    public PositiveInteger getBitOffset() {
    return this.bitOffset;
}

    public void setBitOffset(PositiveInteger value) {
        this.bitOffset = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-ELEMENTS")
@XmlElement(name="DIAGNOSTIC-DATA-ELEMENT")
    public ArrayList<DiagnosticDataElement> getDataElements() {
    return this.dataElements;
}

    public void setDataElements(ArrayList<DiagnosticDataElement> value) {
        this.dataElements = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}