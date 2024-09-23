package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Endtoendtransformationisignalpropsvariants {

    
    
    protected ArrayList<EndToEndTransformationISignalPropsConditional> endToEndTransformationISignalPropsConditionals;
    
    

    
    
    @XmlElement(name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL")
    public ArrayList<EndToEndTransformationISignalPropsConditional> getEndToEndTransformationISignalPropsConditionals() {
        return this.endToEndTransformationISignalPropsConditionals;
    }

    public void setEndToEndTransformationISignalPropsConditionals(ArrayList<EndToEndTransformationISignalPropsConditional> value) {
        this.endToEndTransformationISignalPropsConditionals = value;
    }
    
    
}