package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dtcs {

    
    
    protected ArrayList<DiagnosticTroubleCodeRefConditional> diagnosticTroubleCodeRefConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-TROUBLE-CODE-REF-CONDITIONAL")
    public ArrayList<DiagnosticTroubleCodeRefConditional> getDiagnosticTroubleCodeRefConditionals() {
        return this.diagnosticTroubleCodeRefConditionals;
    }

    public void setDiagnosticTroubleCodeRefConditionals(ArrayList<DiagnosticTroubleCodeRefConditional> value) {
        this.diagnosticTroubleCodeRefConditionals = value;
    }
    
    
}