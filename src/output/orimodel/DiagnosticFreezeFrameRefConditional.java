package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-FREEZE-FRAME-REF-CONDITIONAL")
public class DiagnosticFreezeFrameRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticFreezeFrameRef diagnosticFreezeFrameRef;
    
    
    
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
    
    
    
    @XmlElement(name="DIAGNOSTIC-FREEZE-FRAME-REF")
    public DiagnosticFreezeFrameRef getDiagnosticFreezeFrameRef() {
    return this.diagnosticFreezeFrameRef;
}

    public void setDiagnosticFreezeFrameRef(DiagnosticFreezeFrameRef value) {
        this.diagnosticFreezeFrameRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}