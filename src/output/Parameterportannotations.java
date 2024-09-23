package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Parameterportannotations {

    
    
    protected ArrayList<ParameterPortAnnotation> parameterPortAnnotations;
    
    

    
    
    @XmlElement(name="PARAMETER-PORT-ANNOTATION")
    public ArrayList<ParameterPortAnnotation> getParameterPortAnnotations() {
        return this.parameterPortAnnotations;
    }

    public void setParameterPortAnnotations(ArrayList<ParameterPortAnnotation> value) {
        this.parameterPortAnnotations = value;
    }
    
    
}