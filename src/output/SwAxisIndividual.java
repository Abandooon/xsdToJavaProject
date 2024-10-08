package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwAxisIndividual {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected EncapsulatedEntryRef encapsulatedEntryRef;
    
    
    
    protected SwVariableRefs swVariableRefs;
    
    
    
    protected CompuMethodRef compuMethodRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="ENCAPSULATED-ENTRY-REF")
    public EncapsulatedEntryRef getEncapsulatedEntryRef() {
        return this.encapsulatedEntryRef;
    }

    public void setEncapsulatedEntryRef(EncapsulatedEntryRef value) {
        this.encapsulatedEntryRef = value;
    }
    
    
    
    @XmlElement(name="SW-VARIABLE-REFS")
    public SwVariableRefs getSwVariableRefs() {
        return this.swVariableRefs;
    }

    public void setSwVariableRefs(SwVariableRefs value) {
        this.swVariableRefs = value;
    }
    
    
    
    @XmlElement(name="COMPU-METHOD-REF")
    public CompuMethodRef getCompuMethodRef() {
        return this.compuMethodRef;
    }

    public void setCompuMethodRef(CompuMethodRef value) {
        this.compuMethodRef = value;
    }
    
    
}