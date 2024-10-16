package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-STORAGE-CONDITION-REF-CONDITIONAL")
public class DiagnosticStorageConditionRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticStorageConditionRef diagnosticStorageConditionRef;
    
    
    
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
    
    
    
    @XmlElement(name="DIAGNOSTIC-STORAGE-CONDITION-REF")
    public DiagnosticStorageConditionRef getDiagnosticStorageConditionRef() {
    return this.diagnosticStorageConditionRef;
}

    public void setDiagnosticStorageConditionRef(DiagnosticStorageConditionRef value) {
        this.diagnosticStorageConditionRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}