package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transformationdescriptions {

    
    
    protected ArrayList<EndToEndTransformationDescription> endToEndTransformationDescriptions;
    
    
    
    protected ArrayList<SomeipTransformationDescription> someipTransformationDescriptions;
    
    
    
    protected ArrayList<UserDefinedTransformationDescription> userDefinedTransformationDescriptions;
    
    

    
    
    @XmlElement(name="END-TO-END-TRANSFORMATION-DESCRIPTION")
    public ArrayList<EndToEndTransformationDescription> getEndToEndTransformationDescriptions() {
        return this.endToEndTransformationDescriptions;
    }

    public void setEndToEndTransformationDescriptions(ArrayList<EndToEndTransformationDescription> value) {
        this.endToEndTransformationDescriptions = value;
    }
    
    
    
    @XmlElement(name="SOMEIP-TRANSFORMATION-DESCRIPTION")
    public ArrayList<SomeipTransformationDescription> getSomeipTransformationDescriptions() {
        return this.someipTransformationDescriptions;
    }

    public void setSomeipTransformationDescriptions(ArrayList<SomeipTransformationDescription> value) {
        this.someipTransformationDescriptions = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-TRANSFORMATION-DESCRIPTION")
    public ArrayList<UserDefinedTransformationDescription> getUserDefinedTransformationDescriptions() {
        return this.userDefinedTransformationDescriptions;
    }

    public void setUserDefinedTransformationDescriptions(ArrayList<UserDefinedTransformationDescription> value) {
        this.userDefinedTransformationDescriptions = value;
    }
    
    
}