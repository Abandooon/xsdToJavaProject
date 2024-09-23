package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Derivedfromblueprintrefs {

    
    
    protected ArrayList<DerivedFromBlueprintRef> derivedFromBlueprintRefs;
    
    

    
    
    @XmlElement(name="DERIVED-FROM-BLUEPRINT-REF")
    public ArrayList<DerivedFromBlueprintRef> getDerivedFromBlueprintRefs() {
        return this.derivedFromBlueprintRefs;
    }

    public void setDerivedFromBlueprintRefs(ArrayList<DerivedFromBlueprintRef> value) {
        this.derivedFromBlueprintRefs = value;
    }
    
    
}