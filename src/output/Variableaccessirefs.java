package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Variableaccessirefs {

    
    
    protected ArrayList<VariableAccessInEcuInstanceRef> variableAccessIrefs;
    
    

    
    
    @XmlElement(name="VARIABLE-ACCESS-IREF")
    public ArrayList<VariableAccessInEcuInstanceRef> getVariableAccessIrefs() {
        return this.variableAccessIrefs;
    }

    public void setVariableAccessIrefs(ArrayList<VariableAccessInEcuInstanceRef> value) {
        this.variableAccessIrefs = value;
    }
    
    
}