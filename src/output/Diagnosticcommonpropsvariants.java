package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticcommonpropsvariants {

    
    
    protected ArrayList<DiagnosticCommonPropsConditional> diagnosticCommonPropsConditionals;
    
    

    
    
    @XmlElement(name="DIAGNOSTIC-COMMON-PROPS-CONDITIONAL")
    public ArrayList<DiagnosticCommonPropsConditional> getDiagnosticCommonPropsConditionals() {
        return this.diagnosticCommonPropsConditionals;
    }

    public void setDiagnosticCommonPropsConditionals(ArrayList<DiagnosticCommonPropsConditional> value) {
        this.diagnosticCommonPropsConditionals = value;
    }
    
    
}