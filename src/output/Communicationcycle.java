package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Communicationcycle {

    
    
    protected CycleCounter cycleCounter;
    
    
    
    protected CycleRepetition cycleRepetition;
    
    

    
    
    @XmlElement(name="CYCLE-COUNTER")
    public CycleCounter getCycleCounter() {
        return this.cycleCounter;
    }

    public void setCycleCounter(CycleCounter value) {
        this.cycleCounter = value;
    }
    
    
    
    @XmlElement(name="CYCLE-REPETITION")
    public CycleRepetition getCycleRepetition() {
        return this.cycleRepetition;
    }

    public void setCycleRepetition(CycleRepetition value) {
        this.cycleRepetition = value;
    }
    
    
}