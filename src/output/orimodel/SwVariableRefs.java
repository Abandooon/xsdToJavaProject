package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwVariableRefs {

    
    
    protected ArrayList<AutosarVariableRef> autosarVariable;
    
    
    
    protected ArrayList<McDataInstanceVarRef> mcDataInstanceVarRef;
    
    

    
    
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