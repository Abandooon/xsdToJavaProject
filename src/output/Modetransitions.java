package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modetransitions {

    
    
    protected ArrayList<ModeTransition> modeTransitions;
    
    

    
    
    @XmlElement(name="MODE-TRANSITION")
    public ArrayList<ModeTransition> getModeTransitions() {
        return this.modeTransitions;
    }

    public void setModeTransitions(ArrayList<ModeTransition> value) {
        this.modeTransitions = value;
    }
    
    
}