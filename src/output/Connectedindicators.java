package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Connectedindicators {

    
    
    protected ArrayList<DiagnosticConnectedIndicator> diagnosticConnectedIndicators;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-CONNECTED-INDICATOR")
    public ArrayList<DiagnosticConnectedIndicator> getDiagnosticConnectedIndicators() {
        return this.diagnosticConnectedIndicators;
    }

    public void setDiagnosticConnectedIndicators(ArrayList<DiagnosticConnectedIndicator> value) {
        this.diagnosticConnectedIndicators = value;
    }
    
    
}