package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-CONNECTED-INDICATOR-BEHAVIOR-ENUM")
public class DiagnosticConnectedIndicatorBehaviorEnum {

    
    
    protected DiagnosticConnectedIndicatorBehaviorEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public DiagnosticConnectedIndicatorBehaviorEnumSimple getValue() {
    return this.value;
}

    public void setValue(DiagnosticConnectedIndicatorBehaviorEnumSimple value) {
        this.value = value;
    }
    
    
    
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
    
    
}