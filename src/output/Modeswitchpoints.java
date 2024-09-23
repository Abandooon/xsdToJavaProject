package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modeswitchpoints {

    
    
    protected ArrayList<ModeSwitchPoint> modeSwitchPoints;
    
    

    
    
    @XmlElement(name="MODE-SWITCH-POINT")
    public ArrayList<ModeSwitchPoint> getModeSwitchPoints() {
        return this.modeSwitchPoints;
    }

    public void setModeSwitchPoints(ArrayList<ModeSwitchPoint> value) {
        this.modeSwitchPoints = value;
    }
    
    
}