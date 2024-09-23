package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Interpolationroutinemappings {

    
    
    protected ArrayList<InterpolationRoutineMapping> interpolationRoutineMappings;
    
    

    
    
    @XmlElement(name="INTERPOLATION-ROUTINE-MAPPING")
    public ArrayList<InterpolationRoutineMapping> getInterpolationRoutineMappings() {
        return this.interpolationRoutineMappings;
    }

    public void setInterpolationRoutineMappings(ArrayList<InterpolationRoutineMapping> value) {
        this.interpolationRoutineMappings = value;
    }
    
    
}