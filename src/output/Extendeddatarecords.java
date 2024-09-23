package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Extendeddatarecords {

    
    
    protected ArrayList<DiagnosticExtendedDataRecordRefConditional> diagnosticExtendedDataRecordRefConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-EXTENDED-DATA-RECORD-REF-CONDITIONAL")
    public ArrayList<DiagnosticExtendedDataRecordRefConditional> getDiagnosticExtendedDataRecordRefConditionals() {
        return this.diagnosticExtendedDataRecordRefConditionals;
    }

    public void setDiagnosticExtendedDataRecordRefConditionals(ArrayList<DiagnosticExtendedDataRecordRefConditional> value) {
        this.diagnosticExtendedDataRecordRefConditionals = value;
    }
    
    
}