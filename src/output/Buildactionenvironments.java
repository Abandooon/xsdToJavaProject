package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Buildactionenvironments {

    
    
    protected ArrayList<BuildActionEnvironment> buildActionEnvironments;
    
    

    
    
    @XmlElement(name="BUILD-ACTION-ENVIRONMENT")
    public ArrayList<BuildActionEnvironment> getBuildActionEnvironments() {
        return this.buildActionEnvironments;
    }

    public void setBuildActionEnvironments(ArrayList<BuildActionEnvironment> value) {
        this.buildActionEnvironments = value;
    }
    
    
}