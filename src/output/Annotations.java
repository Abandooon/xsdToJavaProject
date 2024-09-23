package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Annotations {

    
    
    protected ArrayList<Annotation> annotations;
    
    

    
    
    @XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
}