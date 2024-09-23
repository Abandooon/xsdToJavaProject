package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Artifactdescriptors {

    
    
    protected ArrayList<AutosarEngineeringObject> autosarEngineeringObjects;
    
    

    
    
    @XmlElement(name="AUTOSAR-ENGINEERING-OBJECT")
    public ArrayList<AutosarEngineeringObject> getAutosarEngineeringObjects() {
        return this.autosarEngineeringObjects;
    }

    public void setAutosarEngineeringObjects(ArrayList<AutosarEngineeringObject> value) {
        this.autosarEngineeringObjects = value;
    }
    
    
}