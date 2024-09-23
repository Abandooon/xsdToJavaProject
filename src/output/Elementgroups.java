package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Elementgroups {

    
    
    protected ArrayList<McParameterElementGroup> mcParameterElementGroups;
    
    

    
    
    @XmlElement(name="MC-PARAMETER-ELEMENT-GROUP")
    public ArrayList<McParameterElementGroup> getMcParameterElementGroups() {
        return this.mcParameterElementGroups;
    }

    public void setMcParameterElementGroups(ArrayList<McParameterElementGroup> value) {
        this.mcParameterElementGroups = value;
    }
    
    
}