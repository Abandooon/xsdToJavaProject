package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Disabledmodeirefs {

    
    
    protected ArrayList<RModeInAtomicSwcInstanceRef> disabledModeIrefs;
    
    

    
    
    @XmlElement(name="DISABLED-MODE-IREF")
    public ArrayList<RModeInAtomicSwcInstanceRef> getDisabledModeIrefs() {
        return this.disabledModeIrefs;
    }

    public void setDisabledModeIrefs(ArrayList<RModeInAtomicSwcInstanceRef> value) {
        this.disabledModeIrefs = value;
    }
    
    
}