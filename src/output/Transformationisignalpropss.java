package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transformationisignalpropss {

    
    
    protected ArrayList<EndToEndTransformationISignalProps> endToEndTransformationISignalPropss;
    
    
    
    protected ArrayList<SomeipTransformationISignalProps> someipTransformationISignalPropss;
    
    
    
    protected ArrayList<UserDefinedTransformationISignalProps> userDefinedTransformationISignalPropss;
    
    

    
    
    @XmlElement(name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS")
    public ArrayList<EndToEndTransformationISignalProps> getEndToEndTransformationISignalPropss() {
        return this.endToEndTransformationISignalPropss;
    }

    public void setEndToEndTransformationISignalPropss(ArrayList<EndToEndTransformationISignalProps> value) {
        this.endToEndTransformationISignalPropss = value;
    }
    
    
    
    @XmlElement(name="SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS")
    public ArrayList<SomeipTransformationISignalProps> getSomeipTransformationISignalPropss() {
        return this.someipTransformationISignalPropss;
    }

    public void setSomeipTransformationISignalPropss(ArrayList<SomeipTransformationISignalProps> value) {
        this.someipTransformationISignalPropss = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS")
    public ArrayList<UserDefinedTransformationISignalProps> getUserDefinedTransformationISignalPropss() {
        return this.userDefinedTransformationISignalPropss;
    }

    public void setUserDefinedTransformationISignalPropss(ArrayList<UserDefinedTransformationISignalProps> value) {
        this.userDefinedTransformationISignalPropss = value;
    }
    
    
}