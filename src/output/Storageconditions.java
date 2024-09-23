package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Storageconditions {

    
    
    protected ArrayList<DiagnosticStorageConditionRefConditional> diagnosticStorageConditionRefConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-STORAGE-CONDITION-REF-CONDITIONAL")
    public ArrayList<DiagnosticStorageConditionRefConditional> getDiagnosticStorageConditionRefConditionals() {
        return this.diagnosticStorageConditionRefConditionals;
    }

    public void setDiagnosticStorageConditionRefConditionals(ArrayList<DiagnosticStorageConditionRefConditional> value) {
        this.diagnosticStorageConditionRefConditionals = value;
    }
    
    
}