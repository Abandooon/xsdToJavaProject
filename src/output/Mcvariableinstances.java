package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Mcvariableinstances {

    
    
    protected ArrayList<McDataInstance> mcDataInstances;
    
    

    
    
    @XmlElement(name="MC-DATA-INSTANCE")
    public ArrayList<McDataInstance> getMcDataInstances() {
        return this.mcDataInstances;
    }

    public void setMcDataInstances(ArrayList<McDataInstance> value) {
        this.mcDataInstances = value;
    }
    
    
}