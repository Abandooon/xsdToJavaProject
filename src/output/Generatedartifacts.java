package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Generatedartifacts {

    
    
    protected ArrayList<DependencyOnArtifact> dependencyOnArtifacts;
    
    

    
    
    @XmlElement(name="DEPENDENCY-ON-ARTIFACT")
    public ArrayList<DependencyOnArtifact> getDependencyOnArtifacts() {
        return this.dependencyOnArtifacts;
    }

    public void setDependencyOnArtifacts(ArrayList<DependencyOnArtifact> value) {
        this.dependencyOnArtifacts = value;
    }
    
    
}