package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Literals {

    
    
    protected ArrayList<EcucEnumerationLiteralDef> ecucEnumerationLiteralDefs;
    
    

    
    
    @XmlElement(name="ECUC-ENUMERATION-LITERAL-DEF")
    public ArrayList<EcucEnumerationLiteralDef> getEcucEnumerationLiteralDefs() {
        return this.ecucEnumerationLiteralDefs;
    }

    public void setEcucEnumerationLiteralDefs(ArrayList<EcucEnumerationLiteralDef> value) {
        this.ecucEnumerationLiteralDefs = value;
    }
    
    
}