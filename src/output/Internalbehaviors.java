package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Internalbehaviors {

    
    
    protected ArrayList<SwcInternalBehavior> swcInternalBehaviors;
    
    

    
    
    @XmlElement(name="SWC-INTERNAL-BEHAVIOR")
    public ArrayList<SwcInternalBehavior> getSwcInternalBehaviors() {
        return this.swcInternalBehaviors;
    }

    public void setSwcInternalBehaviors(ArrayList<SwcInternalBehavior> value) {
        this.swcInternalBehaviors = value;
    }
    
    
}