package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucParameterDerivationFormula {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Ecucqueryrefs> ecucQueryRefss;
    
    
    
    protected ArrayList<Ecucquerystringrefs> ecucQueryStringRefss;
    
    

    
    
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
    
    
    
    @XmlElement(name="ECUC-QUERY-REF")
    public ArrayList<Ecucqueryrefs> getEcucQueryRefss() {
        return this.ecucQueryRefss;
    }

    public void setEcucQueryRefss(ArrayList<Ecucqueryrefs> value) {
        this.ecucQueryRefss = value;
    }
    
    
    
    @XmlElement(name="ECUC-QUERY-STRING-REF")
    public ArrayList<Ecucquerystringrefs> getEcucQueryStringRefss() {
        return this.ecucQueryStringRefss;
    }

    public void setEcucQueryStringRefss(ArrayList<Ecucquerystringrefs> value) {
        this.ecucQueryStringRefss = value;
    }
    
    
}