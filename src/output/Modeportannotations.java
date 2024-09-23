package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modeportannotations {

    
    
    protected ArrayList<ModePortAnnotation> modePortAnnotations;
    
    

    
    
    @XmlElement(name="MODE-PORT-ANNOTATION")
    public ArrayList<ModePortAnnotation> getModePortAnnotations() {
        return this.modePortAnnotations;
    }

    public void setModePortAnnotations(ArrayList<ModePortAnnotation> value) {
        this.modePortAnnotations = value;
    }
    
    
}