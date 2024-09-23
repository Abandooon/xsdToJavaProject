package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Externaltriggeringpoints {

    
    
    protected ArrayList<ExternalTriggeringPoint> externalTriggeringPoints;
    
    

    
    
    @XmlElement(name="EXTERNAL-TRIGGERING-POINT")
    public ArrayList<ExternalTriggeringPoint> getExternalTriggeringPoints() {
        return this.externalTriggeringPoints;
    }

    public void setExternalTriggeringPoints(ArrayList<ExternalTriggeringPoint> value) {
        this.externalTriggeringPoints = value;
    }
    
    
}