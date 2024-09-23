package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modedeclarationmappings {

    
    
    protected ArrayList<ModeDeclarationMapping> modeDeclarationMappings;
    
    

    
    
    @XmlElement(name="MODE-DECLARATION-MAPPING")
    public ArrayList<ModeDeclarationMapping> getModeDeclarationMappings() {
        return this.modeDeclarationMappings;
    }

    public void setModeDeclarationMappings(ArrayList<ModeDeclarationMapping> value) {
        this.modeDeclarationMappings = value;
    }
    
    
}