package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Absolutelyscheduledtimings {

    
    
    protected ArrayList<FlexrayAbsolutelyScheduledTiming> flexrayAbsolutelyScheduledTimings;
    
    

    
    
    @XmlElement(name="FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING")
    public ArrayList<FlexrayAbsolutelyScheduledTiming> getFlexrayAbsolutelyScheduledTimings() {
        return this.flexrayAbsolutelyScheduledTimings;
    }

    public void setFlexrayAbsolutelyScheduledTimings(ArrayList<FlexrayAbsolutelyScheduledTiming> value) {
        this.flexrayAbsolutelyScheduledTimings = value;
    }
    
    
}