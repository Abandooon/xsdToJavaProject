package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modedeclarationgrouprefs {

    
    
    protected ArrayList<ModeDeclarationGroupRef> modeDeclarationGroupRefs;
    
    

    
    
    @XmlElement(name="MODE-DECLARATION-GROUP-REF")
    public ArrayList<ModeDeclarationGroupRef> getModeDeclarationGroupRefs() {
        return this.modeDeclarationGroupRefs;
    }

    public void setModeDeclarationGroupRefs(ArrayList<ModeDeclarationGroupRef> value) {
        this.modeDeclarationGroupRefs = value;
    }
    
    
}