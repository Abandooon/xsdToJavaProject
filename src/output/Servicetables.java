package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Servicetables {

    
    
    protected ArrayList<DiagnosticServiceTableRefConditional> diagnosticServiceTableRefConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL")
    public ArrayList<DiagnosticServiceTableRefConditional> getDiagnosticServiceTableRefConditionals() {
        return this.diagnosticServiceTableRefConditionals;
    }

    public void setDiagnosticServiceTableRefConditionals(ArrayList<DiagnosticServiceTableRefConditional> value) {
        this.diagnosticServiceTableRefConditionals = value;
    }
    
    
}