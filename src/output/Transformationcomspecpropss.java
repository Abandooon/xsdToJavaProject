package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transformationcomspecpropss {

    
    
    protected ArrayList<EndToEndTransformationComSpecProps> endToEndTransformationComSpecPropss;
    
    
    
    protected ArrayList<UserDefinedTransformationComSpecProps> userDefinedTransformationComSpecPropss;
    
    

    
    
    @XmlElement(name="END-TO-END-TRANSFORMATION-COM-SPEC-PROPS")
    public ArrayList<EndToEndTransformationComSpecProps> getEndToEndTransformationComSpecPropss() {
        return this.endToEndTransformationComSpecPropss;
    }

    public void setEndToEndTransformationComSpecPropss(ArrayList<EndToEndTransformationComSpecProps> value) {
        this.endToEndTransformationComSpecPropss = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-TRANSFORMATION-COM-SPEC-PROPS")
    public ArrayList<UserDefinedTransformationComSpecProps> getUserDefinedTransformationComSpecPropss() {
        return this.userDefinedTransformationComSpecPropss;
    }

    public void setUserDefinedTransformationComSpecPropss(ArrayList<UserDefinedTransformationComSpecProps> value) {
        this.userDefinedTransformationComSpecPropss = value;
    }
    
    
}