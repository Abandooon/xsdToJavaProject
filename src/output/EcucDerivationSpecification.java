package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucDerivationSpecification {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected EcucParameterDerivationFormula calculationFormula;
    
    
    
    protected EcucQuerys ecucQuerys;
    
    
    
    protected MlFormula informalFormula;
    
    

    
    
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
    
    
    
    @XmlElement(name="CALCULATION-FORMULA")
    public EcucParameterDerivationFormula getCalculationFormula() {
        return this.calculationFormula;
    }

    public void setCalculationFormula(EcucParameterDerivationFormula value) {
        this.calculationFormula = value;
    }
    
    
    
    @XmlElement(name="ECUC-QUERYS")
    public EcucQuerys getEcucQuerys() {
        return this.ecucQuerys;
    }

    public void setEcucQuerys(EcucQuerys value) {
        this.ecucQuerys = value;
    }
    
    
    
    @XmlElement(name="INFORMAL-FORMULA")
    public MlFormula getInformalFormula() {
        return this.informalFormula;
    }

    public void setInformalFormula(MlFormula value) {
        this.informalFormula = value;
    }
    
    
}