package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Includedmodedeclarationgroupsets {

    
    
    protected ArrayList<IncludedModeDeclarationGroupSet> includedModeDeclarationGroupSets;
    
    

    
    
    @XmlElement(name="INCLUDED-MODE-DECLARATION-GROUP-SET")
    public ArrayList<IncludedModeDeclarationGroupSet> getIncludedModeDeclarationGroupSets() {
        return this.includedModeDeclarationGroupSets;
    }

    public void setIncludedModeDeclarationGroupSets(ArrayList<IncludedModeDeclarationGroupSet> value) {
        this.includedModeDeclarationGroupSets = value;
    }
    
    
}