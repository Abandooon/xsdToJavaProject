package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swcomparisonvariables {

    
    
    protected ArrayList<AutosarVariableRef> autosarVariables;
    
    
    
    protected ArrayList<McDataInstanceVarRef> mcDataInstanceVarRefs;
    
    

    
    
    @XmlElement(name="AUTOSAR-VARIABLE")
    public ArrayList<AutosarVariableRef> getAutosarVariables() {
        return this.autosarVariables;
    }

    public void setAutosarVariables(ArrayList<AutosarVariableRef> value) {
        this.autosarVariables = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-VAR-REF")
    public ArrayList<McDataInstanceVarRef> getMcDataInstanceVarRefs() {
        return this.mcDataInstanceVarRefs;
    }

    public void setMcDataInstanceVarRefs(ArrayList<McDataInstanceVarRef> value) {
        this.mcDataInstanceVarRefs = value;
    }
    
    
}