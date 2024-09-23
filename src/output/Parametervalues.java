package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Parametervalues {

    
    
    protected ArrayList<EcucAddInfoParamValue> ecucAddInfoParamValues;
    
    
    
    protected ArrayList<EcucNumericalParamValue> ecucNumericalParamValues;
    
    
    
    protected ArrayList<EcucTextualParamValue> ecucTextualParamValues;
    
    

    
    
    @XmlElement(name="ECUC-ADD-INFO-PARAM-VALUE")
    public ArrayList<EcucAddInfoParamValue> getEcucAddInfoParamValues() {
        return this.ecucAddInfoParamValues;
    }

    public void setEcucAddInfoParamValues(ArrayList<EcucAddInfoParamValue> value) {
        this.ecucAddInfoParamValues = value;
    }
    
    
    
    @XmlElement(name="ECUC-NUMERICAL-PARAM-VALUE")
    public ArrayList<EcucNumericalParamValue> getEcucNumericalParamValues() {
        return this.ecucNumericalParamValues;
    }

    public void setEcucNumericalParamValues(ArrayList<EcucNumericalParamValue> value) {
        this.ecucNumericalParamValues = value;
    }
    
    
    
    @XmlElement(name="ECUC-TEXTUAL-PARAM-VALUE")
    public ArrayList<EcucTextualParamValue> getEcucTextualParamValues() {
        return this.ecucTextualParamValues;
    }

    public void setEcucTextualParamValues(ArrayList<EcucTextualParamValue> value) {
        this.ecucTextualParamValues = value;
    }
    
    
}