package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transformationtechnologys {

    
    
    protected ArrayList<TransformationTechnology> transformationTechnologys;
    
    

    
    
    @XmlElement(name="TRANSFORMATION-TECHNOLOGY")
    public ArrayList<TransformationTechnology> getTransformationTechnologys() {
        return this.transformationTechnologys;
    }

    public void setTransformationTechnologys(ArrayList<TransformationTechnology> value) {
        this.transformationTechnologys = value;
    }
    
    
}