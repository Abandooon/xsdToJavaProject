package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Triggerportannotations {

    
    
    protected ArrayList<TriggerPortAnnotation> triggerPortAnnotations;
    
    

    
    
    @XmlElement(name="TRIGGER-PORT-ANNOTATION")
    public ArrayList<TriggerPortAnnotation> getTriggerPortAnnotations() {
        return this.triggerPortAnnotations;
    }

    public void setTriggerPortAnnotations(ArrayList<TriggerPortAnnotation> value) {
        this.triggerPortAnnotations = value;
    }
    
    
}