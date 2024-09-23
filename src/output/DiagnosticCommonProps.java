package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DiagnosticCommonProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticCommonPropsVariants diagnosticCommonPropsVariants;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
        return this.s;
    }

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
        return this.t;
    }

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-COMMON-PROPS-VARIANTS")
    public DiagnosticCommonPropsVariants getDiagnosticCommonPropsVariants() {
        return this.diagnosticCommonPropsVariants;
    }

    public void setDiagnosticCommonPropsVariants(DiagnosticCommonPropsVariants value) {
        this.diagnosticCommonPropsVariants = value;
    }
    
    
}