package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecuclinkersymboldefvariants {

    
    
    protected ArrayList<EcucLinkerSymbolDefConditional> ecucLinkerSymbolDefConditionals;
    
    

    
    
    @XmlElement(name="ECUC-LINKER-SYMBOL-DEF-CONDITIONAL")
    public ArrayList<EcucLinkerSymbolDefConditional> getEcucLinkerSymbolDefConditionals() {
        return this.ecucLinkerSymbolDefConditionals;
    }

    public void setEcucLinkerSymbolDefConditionals(ArrayList<EcucLinkerSymbolDefConditional> value) {
        this.ecucLinkerSymbolDefConditionals = value;
    }
    
    
}