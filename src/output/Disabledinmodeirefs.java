package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Disabledinmodeirefs {

    
    
    protected ArrayList<ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefs;
    
    

    
    
    @XmlElement(name="DISABLED-IN-MODE-IREF")
    public ArrayList<ModeInBswModuleDescriptionInstanceRef> getDisabledInModeIrefs() {
        return this.disabledInModeIrefs;
    }

    public void setDisabledInModeIrefs(ArrayList<ModeInBswModuleDescriptionInstanceRef> value) {
        this.disabledInModeIrefs = value;
    }
    
    
}