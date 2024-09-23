package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Enableconditions {

    
    
    protected ArrayList<DiagnosticEnableConditionRefConditional> diagnosticEnableConditionRefConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-ENABLE-CONDITION-REF-CONDITIONAL")
    public ArrayList<DiagnosticEnableConditionRefConditional> getDiagnosticEnableConditionRefConditionals() {
        return this.diagnosticEnableConditionRefConditionals;
    }

    public void setDiagnosticEnableConditionRefConditionals(ArrayList<DiagnosticEnableConditionRefConditional> value) {
        this.diagnosticEnableConditionRefConditionals = value;
    }
    
    
}