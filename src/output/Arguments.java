package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Arguments {

    
    
    protected ArrayList<AutosarOperationArgumentInstance> autosarOperationArgumentInstances;
    
    

    
    
    @XmlElement(name="AUTOSAR-OPERATION-ARGUMENT-INSTANCE")
    public ArrayList<AutosarOperationArgumentInstance> getAutosarOperationArgumentInstances() {
        return this.autosarOperationArgumentInstances;
    }

    public void setAutosarOperationArgumentInstances(ArrayList<AutosarOperationArgumentInstance> value) {
        this.autosarOperationArgumentInstances = value;
    }
    
    
}