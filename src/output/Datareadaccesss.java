package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Datareadaccesss {

    
    
    protected ArrayList<VariableAccess> variableAccesss;
    
    

    
    
    @XmlElement(name="VARIABLE-ACCESS")
    public ArrayList<VariableAccess> getVariableAccesss() {
        return this.variableAccesss;
    }

    public void setVariableAccesss(ArrayList<VariableAccess> value) {
        this.variableAccesss = value;
    }
    
    
}