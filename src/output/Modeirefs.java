package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modeirefs {

    
    
    protected ArrayList<RModeInAtomicSwcInstanceRef> modeIrefs;
    
    

    
    
    @XmlElement(name="MODE-IREF")
    public ArrayList<RModeInAtomicSwcInstanceRef> getModeIrefs() {
        return this.modeIrefs;
    }

    public void setModeIrefs(ArrayList<RModeInAtomicSwcInstanceRef> value) {
        this.modeIrefs = value;
    }
    
    
}