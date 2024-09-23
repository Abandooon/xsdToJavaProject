package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Typeblueprints {

    
    
    protected ArrayList<AutosarDataTypeRefConditional> autosarDataTypeRefConditionals;
    
    

    
    
    @XmlElement(name="AUTOSAR-DATA-TYPE-REF-CONDITIONAL")
    public ArrayList<AutosarDataTypeRefConditional> getAutosarDataTypeRefConditionals() {
        return this.autosarDataTypeRefConditionals;
    }

    public void setAutosarDataTypeRefConditionals(ArrayList<AutosarDataTypeRefConditional> value) {
        this.autosarDataTypeRefConditionals = value;
    }
    
    
}