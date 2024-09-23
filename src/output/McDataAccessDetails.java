package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class McDataAccessDetails {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected RteEventIrefs rteEventIrefs;
    
    
    
    protected VariableAccessIrefs variableAccessIrefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="RTE-EVENT-IREFS")
    public RteEventIrefs getRteEventIrefs() {
        return this.rteEventIrefs;
    }

    public void setRteEventIrefs(RteEventIrefs value) {
        this.rteEventIrefs = value;
    }
    
    
    
    @XmlElement(name="VARIABLE-ACCESS-IREFS")
    public VariableAccessIrefs getVariableAccessIrefs() {
        return this.variableAccessIrefs;
    }

    public void setVariableAccessIrefs(VariableAccessIrefs value) {
        this.variableAccessIrefs = value;
    }
    
    
}