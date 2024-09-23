package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Confidenceintervals {

    
    
    protected ArrayList<ConfidenceInterval> confidenceIntervals;
    
    

    
    
    @XmlElement(name="CONFIDENCE-INTERVAL")
    public ArrayList<ConfidenceInterval> getConfidenceIntervals() {
        return this.confidenceIntervals;
    }

    public void setConfidenceIntervals(ArrayList<ConfidenceInterval> value) {
        this.confidenceIntervals = value;
    }
    
    
}