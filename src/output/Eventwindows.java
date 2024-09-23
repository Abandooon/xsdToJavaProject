package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Eventwindows {

    
    
    protected ArrayList<DiagnosticEventWindow> diagnosticEventWindows;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-WINDOW")
    public ArrayList<DiagnosticEventWindow> getDiagnosticEventWindows() {
        return this.diagnosticEventWindows;
    }

    public void setDiagnosticEventWindows(ArrayList<DiagnosticEventWindow> value) {
        this.diagnosticEventWindows = value;
    }
    
    
}