package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-HANDLE-DDDI-CONFIGURATION-ENUM")
public class DiagnosticHandleDddiConfigurationEnum {

    
    
    protected DiagnosticHandleDddiConfigurationEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public DiagnosticHandleDddiConfigurationEnumSimple getValue() {
    return this.value;
}

    public void setValue(DiagnosticHandleDddiConfigurationEnumSimple value) {
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