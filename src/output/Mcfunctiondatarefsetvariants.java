package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Mcfunctiondatarefsetvariants {

    
    
    protected ArrayList<McFunctionDataRefSetConditional> mcFunctionDataRefSetConditionals;
    
    

    
    
    @XmlElement(name="MC-FUNCTION-DATA-REF-SET-CONDITIONAL")
    public ArrayList<McFunctionDataRefSetConditional> getMcFunctionDataRefSetConditionals() {
        return this.mcFunctionDataRefSetConditionals;
    }

    public void setMcFunctionDataRefSetConditionals(ArrayList<McFunctionDataRefSetConditional> value) {
        this.mcFunctionDataRefSetConditionals = value;
    }
    
    
}