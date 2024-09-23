package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modulerefs {

    
    
    protected ArrayList<ModuleRef> moduleRefs;
    
    

    
    
    @XmlElement(name="MODULE-REF")
    public ArrayList<ModuleRef> getModuleRefs() {
        return this.moduleRefs;
    }

    public void setModuleRefs(ArrayList<ModuleRef> value) {
        this.moduleRefs = value;
    }
    
    
}