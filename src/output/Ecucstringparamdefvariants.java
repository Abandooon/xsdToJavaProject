package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucstringparamdefvariants {

    
    
    protected ArrayList<EcucStringParamDefConditional> ecucStringParamDefConditionals;
    
    

    
    
    @XmlElement(name="ECUC-STRING-PARAM-DEF-CONDITIONAL")
    public ArrayList<EcucStringParamDefConditional> getEcucStringParamDefConditionals() {
        return this.ecucStringParamDefConditionals;
    }

    public void setEcucStringParamDefConditionals(ArrayList<EcucStringParamDefConditional> value) {
        this.ecucStringParamDefConditionals = value;
    }
    
    
}