package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Accessedmodegroups {

    
    
    protected ArrayList<ModeDeclarationGroupPrototypeRefConditional> modeDeclarationGroupPrototypeRefConditionals;
    
    

    
    
    @XmlElement(name="MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL")
    public ArrayList<ModeDeclarationGroupPrototypeRefConditional> getModeDeclarationGroupPrototypeRefConditionals() {
        return this.modeDeclarationGroupPrototypeRefConditionals;
    }

    public void setModeDeclarationGroupPrototypeRefConditionals(ArrayList<ModeDeclarationGroupPrototypeRefConditional> value) {
        this.modeDeclarationGroupPrototypeRefConditionals = value;
    }
    
    
}