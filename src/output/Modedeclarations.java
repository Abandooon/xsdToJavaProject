package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modedeclarations {

    
    
    protected ArrayList<ModeDeclaration> modeDeclarations;
    
    

    
    
    @XmlElement(name="MODE-DECLARATION")
    public ArrayList<ModeDeclaration> getModeDeclarations() {
        return this.modeDeclarations;
    }

    public void setModeDeclarations(ArrayList<ModeDeclaration> value) {
        this.modeDeclarations = value;
    }
    
    
}