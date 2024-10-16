package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-OPERATION-CYCLE-REF-CONDITIONAL")
public class DiagnosticOperationCycleRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticOperationCycleRef diagnosticOperationCycleRef;
    
    
    
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
    
    
    
    @XmlElement(name="DIAGNOSTIC-OPERATION-CYCLE-REF")
    public DiagnosticOperationCycleRef getDiagnosticOperationCycleRef() {
    return this.diagnosticOperationCycleRef;
}

    public void setDiagnosticOperationCycleRef(DiagnosticOperationCycleRef value) {
        this.diagnosticOperationCycleRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}