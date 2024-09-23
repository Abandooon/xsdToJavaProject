package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Combasedsignalgrouptransformations {

    
    
    protected ArrayList<DataTransformationRefConditional> dataTransformationRefConditionals;
    
    

    
    
    @XmlElement(name="DATA-TRANSFORMATION-REF-CONDITIONAL")
    public ArrayList<DataTransformationRefConditional> getDataTransformationRefConditionals() {
        return this.dataTransformationRefConditionals;
    }

    public void setDataTransformationRefConditionals(ArrayList<DataTransformationRefConditional> value) {
        this.dataTransformationRefConditionals = value;
    }
    
    
}