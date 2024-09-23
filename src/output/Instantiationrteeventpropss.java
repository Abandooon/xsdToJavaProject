package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Instantiationrteeventpropss {

    
    
    protected ArrayList<InstantiationTimingEventProps> instantiationTimingEventPropss;
    
    

    
    
    @XmlElement(name="INSTANTIATION-TIMING-EVENT-PROPS")
    public ArrayList<InstantiationTimingEventProps> getInstantiationTimingEventPropss() {
        return this.instantiationTimingEventPropss;
    }

    public void setInstantiationTimingEventPropss(ArrayList<InstantiationTimingEventProps> value) {
        this.instantiationTimingEventPropss = value;
    }
    
    
}