package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modeaccesspoints {

    
    
    protected ArrayList<ModeAccessPoint> modeAccessPoints;
    
    

    
    
    @XmlElement(name="MODE-ACCESS-POINT")
    public ArrayList<ModeAccessPoint> getModeAccessPoints() {
        return this.modeAccessPoints;
    }

    public void setModeAccessPoints(ArrayList<ModeAccessPoint> value) {
        this.modeAccessPoints = value;
    }
    
    
}