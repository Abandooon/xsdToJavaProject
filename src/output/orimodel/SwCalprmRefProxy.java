package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-CALPRM-REF-PROXY")
public class SwCalprmRefProxy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AutosarParameterRef arParameter;
    
    
    
    protected McDataInstanceRef mcDataInstanceRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="AR-PARAMETER")
    public AutosarParameterRef getArParameter() {
    return this.arParameter;
}

    public void setArParameter(AutosarParameterRef value) {
        this.arParameter = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-REF")
    public McDataInstanceRef getMcDataInstanceRef() {
    return this.mcDataInstanceRef;
}

    public void setMcDataInstanceRef(McDataInstanceRef value) {
        this.mcDataInstanceRef = value;
    }
    
    
}