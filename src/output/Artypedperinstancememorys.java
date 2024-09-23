package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Artypedperinstancememorys {

    
    
    protected ArrayList<VariableDataPrototype> variableDataPrototypes;
    
    

    
    
    @XmlElement(name="VARIABLE-DATA-PROTOTYPE")
    public ArrayList<VariableDataPrototype> getVariableDataPrototypes() {
        return this.variableDataPrototypes;
    }

    public void setVariableDataPrototypes(ArrayList<VariableDataPrototype> value) {
        this.variableDataPrototypes = value;
    }
    
    
}