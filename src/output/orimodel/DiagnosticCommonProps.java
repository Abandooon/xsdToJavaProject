package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-COMMON-PROPS")
public class DiagnosticCommonProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<DiagnosticCommonPropsConditional> diagnosticCommonPropsVariants;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="DIAGNOSTIC-COMMON-PROPS-VARIANTS")
@XmlElement(name="DIAGNOSTIC-COMMON-PROPS-CONDITIONAL")
    public ArrayList<DiagnosticCommonPropsConditional> getDiagnosticCommonPropsVariants() {
    return this.diagnosticCommonPropsVariants;
}

    public void setDiagnosticCommonPropsVariants(ArrayList<DiagnosticCommonPropsConditional> value) {
        this.diagnosticCommonPropsVariants = value;
    }
    
    
}