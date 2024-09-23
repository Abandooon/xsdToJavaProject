package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Rootsoftwarecompositions {

    
    
    protected ArrayList<RootSwCompositionPrototype> rootSwCompositionPrototypes;
    
    

    
    
    @XmlElement(name="ROOT-SW-COMPOSITION-PROTOTYPE")
    public ArrayList<RootSwCompositionPrototype> getRootSwCompositionPrototypes() {
        return this.rootSwCompositionPrototypes;
    }

    public void setRootSwCompositionPrototypes(ArrayList<RootSwCompositionPrototype> value) {
        this.rootSwCompositionPrototypes = value;
    }
    
    
}