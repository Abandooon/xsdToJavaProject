package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Periodicrates {

    
    
    protected ArrayList<DiagnosticPeriodicRate> diagnosticPeriodicRates;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-PERIODIC-RATE")
    public ArrayList<DiagnosticPeriodicRate> getDiagnosticPeriodicRates() {
        return this.diagnosticPeriodicRates;
    }

    public void setDiagnosticPeriodicRates(ArrayList<DiagnosticPeriodicRate> value) {
        this.diagnosticPeriodicRates = value;
    }
    
    
}