package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Lcstates {

    
    
    protected ArrayList<LifeCycleState> lifeCycleStates;
    
    

    
    
    @XmlElement(name="LIFE-CYCLE-STATE")
    public ArrayList<LifeCycleState> getLifeCycleStates() {
        return this.lifeCycleStates;
    }

    public void setLifeCycleStates(ArrayList<LifeCycleState> value) {
        this.lifeCycleStates = value;
    }
    
    
}