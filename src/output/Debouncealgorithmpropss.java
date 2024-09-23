package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Debouncealgorithmpropss {

    
    
    protected ArrayList<DiagnosticDebounceAlgorithmProps> diagnosticDebounceAlgorithmPropss;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS")
    public ArrayList<DiagnosticDebounceAlgorithmProps> getDiagnosticDebounceAlgorithmPropss() {
        return this.diagnosticDebounceAlgorithmPropss;
    }

    public void setDiagnosticDebounceAlgorithmPropss(ArrayList<DiagnosticDebounceAlgorithmProps> value) {
        this.diagnosticDebounceAlgorithmPropss = value;
    }
    
    
}