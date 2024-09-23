package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TdEventOccurrenceExpression {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Arguments arguments;
    
    
    
    protected TdEventOccurrenceExpressionFormula formula;
    
    
    
    protected Variables variables;
    
    

    
    
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
    
    
    
    @XmlElement(name="ARGUMENTS")
    public Arguments getArguments() {
        return this.arguments;
    }

    public void setArguments(Arguments value) {
        this.arguments = value;
    }
    
    
    
    @XmlElement(name="FORMULA")
    public TdEventOccurrenceExpressionFormula getFormula() {
        return this.formula;
    }

    public void setFormula(TdEventOccurrenceExpressionFormula value) {
        this.formula = value;
    }
    
    
    
    @XmlElement(name="VARIABLES")
    public Variables getVariables() {
        return this.variables;
    }

    public void setVariables(Variables value) {
        this.variables = value;
    }
    
    
}