package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Someiptransformationisignalpropsvariants {

    
    
    protected ArrayList<SomeipTransformationISignalPropsConditional> someipTransformationISignalPropsConditionals;
    
    

    
    
    @XmlElement(name="SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL")
    public ArrayList<SomeipTransformationISignalPropsConditional> getSomeipTransformationISignalPropsConditionals() {
        return this.someipTransformationISignalPropsConditionals;
    }

    public void setSomeipTransformationISignalPropsConditionals(ArrayList<SomeipTransformationISignalPropsConditional> value) {
        this.someipTransformationISignalPropsConditionals = value;
    }
    
    
}