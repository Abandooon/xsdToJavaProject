package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticsessionrefs {

    
    
    protected ArrayList<DiagnosticSessionRef> diagnosticSessionRefs;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-SESSION-REF")
    public ArrayList<DiagnosticSessionRef> getDiagnosticSessionRefs() {
        return this.diagnosticSessionRefs;
    }

    public void setDiagnosticSessionRefs(ArrayList<DiagnosticSessionRef> value) {
        this.diagnosticSessionRefs = value;
    }
    
    
}