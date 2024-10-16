package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-DATA-DEPENDENCY-ARGS")
public class SwDataDependencyArgs {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<AutosarParameterRef> arParameter;
    
    
    
    protected ArrayList<McDataInstanceRef> mcDataInstanceRef;
    
    
    
    protected ArrayList<AutosarVariableRef> autosarVariable;
    
    
    
    protected ArrayList<McDataInstanceVarRef> mcDataInstanceVarRef;
    
    

    
    
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
    public ArrayList<AutosarParameterRef> getArParameter() {
    return this.arParameter;
}

    public void setArParameter(ArrayList<AutosarParameterRef> value) {
        this.arParameter = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-REF")
    public ArrayList<McDataInstanceRef> getMcDataInstanceRef() {
    return this.mcDataInstanceRef;
}

    public void setMcDataInstanceRef(ArrayList<McDataInstanceRef> value) {
        this.mcDataInstanceRef = value;
    }
    
    
    
    @XmlElement(name="AUTOSAR-VARIABLE")
    public ArrayList<AutosarVariableRef> getAutosarVariable() {
    return this.autosarVariable;
}

    public void setAutosarVariable(ArrayList<AutosarVariableRef> value) {
        this.autosarVariable = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-VAR-REF")
    public ArrayList<McDataInstanceVarRef> getMcDataInstanceVarRef() {
    return this.mcDataInstanceVarRef;
}

    public void setMcDataInstanceVarRef(ArrayList<McDataInstanceVarRef> value) {
        this.mcDataInstanceVarRef = value;
    }
    
    
}