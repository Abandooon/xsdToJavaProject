package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Variableaccessedfordebugrefs {

    
    
    protected ArrayList<VariableAccessedForDebugRef> variableAccessedForDebugRefs;
    
    

    
    
    @XmlElement(name="VARIABLE-ACCESSED-FOR-DEBUG-REF")
    public ArrayList<VariableAccessedForDebugRef> getVariableAccessedForDebugRefs() {
        return this.variableAccessedForDebugRefs;
    }

    public void setVariableAccessedForDebugRefs(ArrayList<VariableAccessedForDebugRef> value) {
        this.variableAccessedForDebugRefs = value;
    }
    
    
}