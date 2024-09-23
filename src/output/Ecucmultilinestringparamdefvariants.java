package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucmultilinestringparamdefvariants {

    
    
    protected ArrayList<EcucMultilineStringParamDefConditional> ecucMultilineStringParamDefConditionals;
    
    

    
    
    @XmlElement(name="ECUC-MULTILINE-STRING-PARAM-DEF-CONDITIONAL")
    public ArrayList<EcucMultilineStringParamDefConditional> getEcucMultilineStringParamDefConditionals() {
        return this.ecucMultilineStringParamDefConditionals;
    }

    public void setEcucMultilineStringParamDefConditionals(ArrayList<EcucMultilineStringParamDefConditional> value) {
        this.ecucMultilineStringParamDefConditionals = value;
    }
    
    
}