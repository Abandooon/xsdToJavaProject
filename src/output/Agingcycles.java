package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Agingcycles {

    
    
    protected ArrayList<DiagnosticOperationCycleRefConditional> diagnosticOperationCycleRefConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-OPERATION-CYCLE-REF-CONDITIONAL")
    public ArrayList<DiagnosticOperationCycleRefConditional> getDiagnosticOperationCycleRefConditionals() {
        return this.diagnosticOperationCycleRefConditionals;
    }

    public void setDiagnosticOperationCycleRefConditionals(ArrayList<DiagnosticOperationCycleRefConditional> value) {
        this.diagnosticOperationCycleRefConditionals = value;
    }
    
    
}