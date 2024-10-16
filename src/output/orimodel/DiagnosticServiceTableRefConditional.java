package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL")
public class DiagnosticServiceTableRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticServiceTableRef diagnosticServiceTableRef;
    
    
    
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
    
    
    
    @XmlElement(name="DIAGNOSTIC-SERVICE-TABLE-REF")
    public DiagnosticServiceTableRef getDiagnosticServiceTableRef() {
    return this.diagnosticServiceTableRef;
}

    public void setDiagnosticServiceTableRef(DiagnosticServiceTableRef value) {
        this.diagnosticServiceTableRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}