package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FmAttributeValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DefinitionRef definitionRef;
    
    
    
    protected NumericalValue value;
    
    

    
    
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
    
    
    
    @XmlElement(name="DEFINITION-REF")
    public DefinitionRef getDefinitionRef() {
        return this.definitionRef;
    }

    public void setDefinitionRef(DefinitionRef value) {
        this.definitionRef = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public NumericalValue getValue() {
        return this.value;
    }

    public void setValue(NumericalValue value) {
        this.value = value;
    }
    
    
}