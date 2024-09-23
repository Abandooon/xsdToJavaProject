package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ClientServerOperationMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArgumentMappings argumentMappings;
    
    
    
    protected FirstOperationRef firstOperationRef;
    
    
    
    protected SecondOperationRef secondOperationRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="ARGUMENT-MAPPINGS")
    public ArgumentMappings getArgumentMappings() {
        return this.argumentMappings;
    }

    public void setArgumentMappings(ArgumentMappings value) {
        this.argumentMappings = value;
    }
    
    
    
    @XmlElement(name="FIRST-OPERATION-REF")
    public FirstOperationRef getFirstOperationRef() {
        return this.firstOperationRef;
    }

    public void setFirstOperationRef(FirstOperationRef value) {
        this.firstOperationRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-OPERATION-REF")
    public SecondOperationRef getSecondOperationRef() {
        return this.secondOperationRef;
    }

    public void setSecondOperationRef(SecondOperationRef value) {
        this.secondOperationRef = value;
    }
    
    
}