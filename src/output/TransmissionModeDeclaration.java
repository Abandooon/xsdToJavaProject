package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TransmissionModeDeclaration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ModeDrivenFalseConditions modeDrivenFalseConditions;
    
    
    
    protected ModeDrivenTrueConditions modeDrivenTrueConditions;
    
    
    
    protected TransmissionModeConditions transmissionModeConditions;
    
    
    
    protected TransmissionModeTiming transmissionModeFalseTiming;
    
    
    
    protected TransmissionModeTiming transmissionModeTrueTiming;
    
    

    
    
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
    
    
    
    @XmlElement(name="MODE-DRIVEN-FALSE-CONDITIONS")
    public ModeDrivenFalseConditions getModeDrivenFalseConditions() {
        return this.modeDrivenFalseConditions;
    }

    public void setModeDrivenFalseConditions(ModeDrivenFalseConditions value) {
        this.modeDrivenFalseConditions = value;
    }
    
    
    
    @XmlElement(name="MODE-DRIVEN-TRUE-CONDITIONS")
    public ModeDrivenTrueConditions getModeDrivenTrueConditions() {
        return this.modeDrivenTrueConditions;
    }

    public void setModeDrivenTrueConditions(ModeDrivenTrueConditions value) {
        this.modeDrivenTrueConditions = value;
    }
    
    
    
    @XmlElement(name="TRANSMISSION-MODE-CONDITIONS")
    public TransmissionModeConditions getTransmissionModeConditions() {
        return this.transmissionModeConditions;
    }

    public void setTransmissionModeConditions(TransmissionModeConditions value) {
        this.transmissionModeConditions = value;
    }
    
    
    
    @XmlElement(name="TRANSMISSION-MODE-FALSE-TIMING")
    public TransmissionModeTiming getTransmissionModeFalseTiming() {
        return this.transmissionModeFalseTiming;
    }

    public void setTransmissionModeFalseTiming(TransmissionModeTiming value) {
        this.transmissionModeFalseTiming = value;
    }
    
    
    
    @XmlElement(name="TRANSMISSION-MODE-TRUE-TIMING")
    public TransmissionModeTiming getTransmissionModeTrueTiming() {
        return this.transmissionModeTrueTiming;
    }

    public void setTransmissionModeTrueTiming(TransmissionModeTiming value) {
        this.transmissionModeTrueTiming = value;
    }
    
    
}