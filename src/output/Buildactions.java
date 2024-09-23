package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Buildactions {

    
    
    protected ArrayList<BuildAction> buildActions;
    
    

    
    
    @XmlElement(name="BUILD-ACTION")
    public ArrayList<BuildAction> getBuildActions() {
        return this.buildActions;
    }

    public void setBuildActions(ArrayList<BuildAction> value) {
        this.buildActions = value;
    }
    
    
}