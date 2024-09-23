package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwDataDependencyArgs {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Arparameters> arParameterss;
    
    
    
    protected ArrayList<Mcdatainstancerefs> mcDataInstanceRefss;
    
    
    
    protected ArrayList<Autosarvariables> autosarVariabless;
    
    
    
    protected ArrayList<Mcdatainstancevarrefs> mcDataInstanceVarRefss;
    
    

    
    
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
    
    
    
    @XmlElement(name="AR-PARAMETER")
    public ArrayList<Arparameters> getArParameterss() {
        return this.arParameterss;
    }

    public void setArParameterss(ArrayList<Arparameters> value) {
        this.arParameterss = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-REF")
    public ArrayList<Mcdatainstancerefs> getMcDataInstanceRefss() {
        return this.mcDataInstanceRefss;
    }

    public void setMcDataInstanceRefss(ArrayList<Mcdatainstancerefs> value) {
        this.mcDataInstanceRefss = value;
    }
    
    
    
    @XmlElement(name="AUTOSAR-VARIABLE")
    public ArrayList<Autosarvariables> getAutosarVariabless() {
        return this.autosarVariabless;
    }

    public void setAutosarVariabless(ArrayList<Autosarvariables> value) {
        this.autosarVariabless = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-VAR-REF")
    public ArrayList<Mcdatainstancevarrefs> getMcDataInstanceVarRefss() {
        return this.mcDataInstanceVarRefss;
    }

    public void setMcDataInstanceVarRefss(ArrayList<Mcdatainstancevarrefs> value) {
        this.mcDataInstanceVarRefss = value;
    }
    
    
}