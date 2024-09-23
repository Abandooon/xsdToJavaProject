package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Subnodechannels {

    
    
    protected ArrayList<DiagnosticComControlSubNodeChannel> diagnosticComControlSubNodeChannels;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-COM-CONTROL-SUB-NODE-CHANNEL")
    public ArrayList<DiagnosticComControlSubNodeChannel> getDiagnosticComControlSubNodeChannels() {
        return this.diagnosticComControlSubNodeChannels;
    }

    public void setDiagnosticComControlSubNodeChannels(ArrayList<DiagnosticComControlSubNodeChannel> value) {
        this.diagnosticComControlSubNodeChannels = value;
    }
    
    
}