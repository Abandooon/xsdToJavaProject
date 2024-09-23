package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DiagnosticEventWindow {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DiagnosticEventWindowTimeEnum eventWindowTime;
    
    
    
    protected Boolean storageStateEvaluation;
    
    

    
    
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
    
    
    
    @XmlElement(name="EVENT-WINDOW-TIME")
    public DiagnosticEventWindowTimeEnum getEventWindowTime() {
        return this.eventWindowTime;
    }

    public void setEventWindowTime(DiagnosticEventWindowTimeEnum value) {
        this.eventWindowTime = value;
    }
    
    
    
    @XmlElement(name="STORAGE-STATE-EVALUATION")
    public Boolean getStorageStateEvaluation() {
        return this.storageStateEvaluation;
    }

    public void setStorageStateEvaluation(Boolean value) {
        this.storageStateEvaluation = value;
    }
    
    
}