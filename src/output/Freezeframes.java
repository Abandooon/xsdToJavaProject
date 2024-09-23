package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Freezeframes {

    
    
    protected ArrayList<DiagnosticFreezeFrameRefConditional> diagnosticFreezeFrameRefConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-FREEZE-FRAME-REF-CONDITIONAL")
    public ArrayList<DiagnosticFreezeFrameRefConditional> getDiagnosticFreezeFrameRefConditionals() {
        return this.diagnosticFreezeFrameRefConditionals;
    }

    public void setDiagnosticFreezeFrameRefConditionals(ArrayList<DiagnosticFreezeFrameRefConditional> value) {
        this.diagnosticFreezeFrameRefConditionals = value;
    }
    
    
}