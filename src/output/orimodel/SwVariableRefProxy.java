package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-VARIABLE-REF-PROXY")
public class SwVariableRefProxy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AutosarVariableRef autosarVariable;
    
    
    
    protected McDataInstanceVarRef mcDataInstanceVarRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="AUTOSAR-VARIABLE")
    public AutosarVariableRef getAutosarVariable() {
    return this.autosarVariable;
}

    public void setAutosarVariable(AutosarVariableRef value) {
        this.autosarVariable = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-VAR-REF")
    public McDataInstanceVarRef getMcDataInstanceVarRef() {
    return this.mcDataInstanceVarRef;
}

    public void setMcDataInstanceVarRef(McDataInstanceVarRef value) {
        this.mcDataInstanceVarRef = value;
    }
    
    
}