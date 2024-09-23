package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucDestinationUriPolicy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Containers containers;
    
    
    
    protected EcucDestinationUriNestingContractEnum destinationUriNestingContract;
    
    
    
    protected Parameters parameters;
    
    
    
    protected References references;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTAINERS")
    public Containers getContainers() {
        return this.containers;
    }

    public void setContainers(Containers value) {
        this.containers = value;
    }
    
    
    
    @XmlElement(name="DESTINATION-URI-NESTING-CONTRACT")
    public EcucDestinationUriNestingContractEnum getDestinationUriNestingContract() {
        return this.destinationUriNestingContract;
    }

    public void setDestinationUriNestingContract(EcucDestinationUriNestingContractEnum value) {
        this.destinationUriNestingContract = value;
    }
    
    
    
    @XmlElement(name="PARAMETERS")
    public Parameters getParameters() {
        return this.parameters;
    }

    public void setParameters(Parameters value) {
        this.parameters = value;
    }
    
    
    
    @XmlElement(name="REFERENCES")
    public References getReferences() {
        return this.references;
    }

    public void setReferences(References value) {
        this.references = value;
    }
    
    
}