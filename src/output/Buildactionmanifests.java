package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Buildactionmanifests {

    
    
    protected ArrayList<BuildActionManifestRefConditional> buildActionManifestRefConditionals;
    
    

    
    
    @XmlElement(name="BUILD-ACTION-MANIFEST-REF-CONDITIONAL")
    public ArrayList<BuildActionManifestRefConditional> getBuildActionManifestRefConditionals() {
        return this.buildActionManifestRefConditionals;
    }

    public void setBuildActionManifestRefConditionals(ArrayList<BuildActionManifestRefConditional> value) {
        this.buildActionManifestRefConditionals = value;
    }
    
    
}