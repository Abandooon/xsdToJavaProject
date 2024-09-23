package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwattributeliterals {

    
    
    protected ArrayList<HwAttributeLiteralDef> hwAttributeLiteralDefs;
    
    

    
    
    @XmlElement(name="HW-ATTRIBUTE-LITERAL-DEF")
    public ArrayList<HwAttributeLiteralDef> getHwAttributeLiteralDefs() {
        return this.hwAttributeLiteralDefs;
    }

    public void setHwAttributeLiteralDefs(ArrayList<HwAttributeLiteralDef> value) {
        this.hwAttributeLiteralDefs = value;
    }
    
    
}