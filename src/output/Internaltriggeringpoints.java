package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Internaltriggeringpoints {

    
    
    protected ArrayList<InternalTriggeringPoint> internalTriggeringPoints;
    
    

    
    
    @XmlElement(name="INTERNAL-TRIGGERING-POINT")
    public ArrayList<InternalTriggeringPoint> getInternalTriggeringPoints() {
        return this.internalTriggeringPoints;
    }

    public void setInternalTriggeringPoints(ArrayList<InternalTriggeringPoint> value) {
        this.internalTriggeringPoints = value;
    }
    
    
}