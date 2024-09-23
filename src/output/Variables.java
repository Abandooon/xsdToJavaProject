package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Variables {

    
    
    protected ArrayList<AutosarVariableInstance> autosarVariableInstances;
    
    

    
    
    @XmlElement(name="AUTOSAR-VARIABLE-INSTANCE")
    public ArrayList<AutosarVariableInstance> getAutosarVariableInstances() {
        return this.autosarVariableInstances;
    }

    public void setAutosarVariableInstances(ArrayList<AutosarVariableInstance> value) {
        this.autosarVariableInstances = value;
    }
    
    
}