package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-COMMON-ELEMENT-REF-CONDITIONAL")
public class DiagnosticCommonElementRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticCommonElementRef diagnosticCommonElementRef;
    
    
    
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
    
    
    
    @XmlElement(name="DIAGNOSTIC-COMMON-ELEMENT-REF")
    public DiagnosticCommonElementRef getDiagnosticCommonElementRef() {
    return this.diagnosticCommonElementRef;
}

    public void setDiagnosticCommonElementRef(DiagnosticCommonElementRef value) {
        this.diagnosticCommonElementRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}