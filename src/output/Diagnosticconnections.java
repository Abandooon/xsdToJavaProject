package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticconnections {

    
    
    protected ArrayList<DiagnosticConnectionRefConditional> diagnosticConnectionRefConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-CONNECTION-REF-CONDITIONAL")
    public ArrayList<DiagnosticConnectionRefConditional> getDiagnosticConnectionRefConditionals() {
        return this.diagnosticConnectionRefConditionals;
    }

    public void setDiagnosticConnectionRefConditionals(ArrayList<DiagnosticConnectionRefConditional> value) {
        this.diagnosticConnectionRefConditionals = value;
    }
    
    
}