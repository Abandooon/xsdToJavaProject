package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BlueprintPolicys {

    
    
    protected ArrayList<BlueprintPolicyList> blueprintPolicyList;
    
    
    
    protected ArrayList<BlueprintPolicyNotModifiable> blueprintPolicyNotModifiable;
    
    
    
    protected ArrayList<BlueprintPolicySingle> blueprintPolicySingle;
    
    

    
    
    @XmlElement(name="BLUEPRINT-POLICY-LIST")
    public ArrayList<BlueprintPolicyList> getBlueprintPolicyList() {
    return this.blueprintPolicyList;
}

    public void setBlueprintPolicyList(ArrayList<BlueprintPolicyList> value) {
        this.blueprintPolicyList = value;
    }
    
    
    
    @XmlElement(name="BLUEPRINT-POLICY-NOT-MODIFIABLE")
    public ArrayList<BlueprintPolicyNotModifiable> getBlueprintPolicyNotModifiable() {
    return this.blueprintPolicyNotModifiable;
}

    public void setBlueprintPolicyNotModifiable(ArrayList<BlueprintPolicyNotModifiable> value) {
        this.blueprintPolicyNotModifiable = value;
    }
    
    
    
    @XmlElement(name="BLUEPRINT-POLICY-SINGLE")
    public ArrayList<BlueprintPolicySingle> getBlueprintPolicySingle() {
    return this.blueprintPolicySingle;
}

    public void setBlueprintPolicySingle(ArrayList<BlueprintPolicySingle> value) {
        this.blueprintPolicySingle = value;
    }
    
    
}