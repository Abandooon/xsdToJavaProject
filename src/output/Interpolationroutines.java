package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Interpolationroutines {

    
    
    protected ArrayList<InterpolationRoutine> interpolationRoutines;
    
    

    
    
    @XmlElement(name="INTERPOLATION-ROUTINE")
    public ArrayList<InterpolationRoutine> getInterpolationRoutines() {
        return this.interpolationRoutines;
    }

    public void setInterpolationRoutines(ArrayList<InterpolationRoutine> value) {
        this.interpolationRoutines = value;
    }
    
    
}