package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Blueprintpolicys {

    
    
    protected ArrayList<BlueprintPolicyList> blueprintPolicyLists;
    
    
    
    protected ArrayList<BlueprintPolicyNotModifiable> blueprintPolicyNotModifiables;
    
    
    
    protected ArrayList<BlueprintPolicySingle> blueprintPolicySingles;
    
    

    
    
    @XmlElement(name="BLUEPRINT-POLICY-LIST")
    public ArrayList<BlueprintPolicyList> getBlueprintPolicyLists() {
        return this.blueprintPolicyLists;
    }

    public void setBlueprintPolicyLists(ArrayList<BlueprintPolicyList> value) {
        this.blueprintPolicyLists = value;
    }
    
    
    
    @XmlElement(name="BLUEPRINT-POLICY-NOT-MODIFIABLE")
    public ArrayList<BlueprintPolicyNotModifiable> getBlueprintPolicyNotModifiables() {
        return this.blueprintPolicyNotModifiables;
    }

    public void setBlueprintPolicyNotModifiables(ArrayList<BlueprintPolicyNotModifiable> value) {
        this.blueprintPolicyNotModifiables = value;
    }
    
    
    
    @XmlElement(name="BLUEPRINT-POLICY-SINGLE")
    public ArrayList<BlueprintPolicySingle> getBlueprintPolicySingles() {
        return this.blueprintPolicySingles;
    }

    public void setBlueprintPolicySingles(ArrayList<BlueprintPolicySingle> value) {
        this.blueprintPolicySingles = value;
    }
    
    
}