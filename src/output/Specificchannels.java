package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Specificchannels {

    
    
    protected ArrayList<DiagnosticComControlSpecificChannel> diagnosticComControlSpecificChannels;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-COM-CONTROL-SPECIFIC-CHANNEL")
    public ArrayList<DiagnosticComControlSpecificChannel> getDiagnosticComControlSpecificChannels() {
        return this.diagnosticComControlSpecificChannels;
    }

    public void setDiagnosticComControlSpecificChannels(ArrayList<DiagnosticComControlSpecificChannel> value) {
        this.diagnosticComControlSpecificChannels = value;
    }
    
    
}