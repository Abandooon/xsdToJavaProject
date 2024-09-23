package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Requiredmodegroups {

    
    
    protected ArrayList<ModeDeclarationGroupPrototype> modeDeclarationGroupPrototypes;
    
    

    
    
    @XmlElement(name="MODE-DECLARATION-GROUP-PROTOTYPE")
    public ArrayList<ModeDeclarationGroupPrototype> getModeDeclarationGroupPrototypes() {
        return this.modeDeclarationGroupPrototypes;
    }

    public void setModeDeclarationGroupPrototypes(ArrayList<ModeDeclarationGroupPrototype> value) {
        this.modeDeclarationGroupPrototypes = value;
    }
    
    
}