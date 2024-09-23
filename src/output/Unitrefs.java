package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Unitrefs {

    
    
    protected ArrayList<UnitRef> unitRefs;
    
    

    
    
    @XmlElement(name="UNIT-REF")
    public ArrayList<UnitRef> getUnitRefs() {
        return this.unitRefs;
    }

    public void setUnitRefs(ArrayList<UnitRef> value) {
        this.unitRefs = value;
    }
    
    
}