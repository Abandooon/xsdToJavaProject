package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modedeclarationrefs {

    
    
    protected ArrayList<ModeDeclarationRef> modeDeclarationRefs;
    
    

    
    
    @XmlElement(name="MODE-DECLARATION-REF")
    public ArrayList<ModeDeclarationRef> getModeDeclarationRefs() {
        return this.modeDeclarationRefs;
    }

    public void setModeDeclarationRefs(ArrayList<ModeDeclarationRef> value) {
        this.modeDeclarationRefs = value;
    }
    
    
}