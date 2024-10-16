package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-EXTENDED-DATA-RECORD-REF-CONDITIONAL")
public class DiagnosticExtendedDataRecordRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticExtendedDataRecordRef diagnosticExtendedDataRecordRef;
    
    
    
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
    
    
    
    @XmlElement(name="DIAGNOSTIC-EXTENDED-DATA-RECORD-REF")
    public DiagnosticExtendedDataRecordRef getDiagnosticExtendedDataRecordRef() {
    return this.diagnosticExtendedDataRecordRef;
}

    public void setDiagnosticExtendedDataRecordRef(DiagnosticExtendedDataRecordRef value) {
        this.diagnosticExtendedDataRecordRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}