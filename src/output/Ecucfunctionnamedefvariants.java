package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucfunctionnamedefvariants {

    
    
    protected ArrayList<EcucFunctionNameDefConditional> ecucFunctionNameDefConditionals;
    
    

    
    
    @XmlElement(name="ECUC-FUNCTION-NAME-DEF-CONDITIONAL")
    public ArrayList<EcucFunctionNameDefConditional> getEcucFunctionNameDefConditionals() {
        return this.ecucFunctionNameDefConditionals;
    }

    public void setEcucFunctionNameDefConditionals(ArrayList<EcucFunctionNameDefConditional> value) {
        this.ecucFunctionNameDefConditionals = value;
    }
    
    
}