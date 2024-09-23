package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Responses {

    
    
    protected ArrayList<DiagnosticParameter> diagnosticParameters;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-PARAMETER")
    public ArrayList<DiagnosticParameter> getDiagnosticParameters() {
        return this.diagnosticParameters;
    }

    public void setDiagnosticParameters(ArrayList<DiagnosticParameter> value) {
        this.diagnosticParameters = value;
    }
    
    
}