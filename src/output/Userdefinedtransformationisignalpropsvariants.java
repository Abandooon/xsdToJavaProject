package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Userdefinedtransformationisignalpropsvariants {

    
    
    protected ArrayList<UserDefinedTransformationISignalPropsConditional> userDefinedTransformationISignalPropsConditionals;
    
    

    
    
    @XmlElement(name="USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL")
    public ArrayList<UserDefinedTransformationISignalPropsConditional> getUserDefinedTransformationISignalPropsConditionals() {
        return this.userDefinedTransformationISignalPropsConditionals;
    }

    public void setUserDefinedTransformationISignalPropsConditionals(ArrayList<UserDefinedTransformationISignalPropsConditional> value) {
        this.userDefinedTransformationISignalPropsConditionals = value;
    }
    
    
}