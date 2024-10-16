package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-TROUBLE-CODE-REF-CONDITIONAL")
public class DiagnosticTroubleCodeRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticTroubleCodeRef diagnosticTroubleCodeRef;
    
    
    
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
    
    
    
    @XmlElement(name="DIAGNOSTIC-TROUBLE-CODE-REF")
    public DiagnosticTroubleCodeRef getDiagnosticTroubleCodeRef() {
    return this.diagnosticTroubleCodeRef;
}

    public void setDiagnosticTroubleCodeRef(DiagnosticTroubleCodeRef value) {
        this.diagnosticTroubleCodeRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}