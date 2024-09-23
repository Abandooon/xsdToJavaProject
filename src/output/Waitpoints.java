package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Waitpoints {

    
    
    protected ArrayList<WaitPoint> waitPoints;
    
    

    
    
    @XmlElement(name="WAIT-POINT")
    public ArrayList<WaitPoint> getWaitPoints() {
        return this.waitPoints;
    }

    public void setWaitPoints(ArrayList<WaitPoint> value) {
        this.waitPoints = value;
    }
    
    
}