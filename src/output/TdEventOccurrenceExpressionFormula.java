package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TdEventOccurrenceExpressionFormula {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Argumentrefs> argumentRefss;
    
    
    
    protected ArrayList<Eventrefs> eventRefss;
    
    
    
    protected ArrayList<Variablerefs> variableRefss;
    
    

    
    
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
    
    
    
    @XmlElement(name="ARGUMENT-REF")
    public ArrayList<Argumentrefs> getArgumentRefss() {
        return this.argumentRefss;
    }

    public void setArgumentRefss(ArrayList<Argumentrefs> value) {
        this.argumentRefss = value;
    }
    
    
    
    @XmlElement(name="EVENT-REF")
    public ArrayList<Eventrefs> getEventRefss() {
        return this.eventRefss;
    }

    public void setEventRefss(ArrayList<Eventrefs> value) {
        this.eventRefss = value;
    }
    
    
    
    @XmlElement(name="VARIABLE-REF")
    public ArrayList<Variablerefs> getVariableRefss() {
        return this.variableRefss;
    }

    public void setVariableRefss(ArrayList<Variablerefs> value) {
        this.variableRefss = value;
    }
    
    
}