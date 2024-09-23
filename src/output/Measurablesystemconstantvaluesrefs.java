package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Measurablesystemconstantvaluesrefs {

    
    
    protected ArrayList<MeasurableSystemConstantValuesRef> measurableSystemConstantValuesRefs;
    
    

    
    
    @XmlElement(name="MEASURABLE-SYSTEM-CONSTANT-VALUES-REF")
    public ArrayList<MeasurableSystemConstantValuesRef> getMeasurableSystemConstantValuesRefs() {
        return this.measurableSystemConstantValuesRefs;
    }

    public void setMeasurableSystemConstantValuesRefs(ArrayList<MeasurableSystemConstantValuesRef> value) {
        this.measurableSystemConstantValuesRefs = value;
    }
    
    
}