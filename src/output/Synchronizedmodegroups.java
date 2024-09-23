package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Synchronizedmodegroups {

    
    
    protected ArrayList<SwcBswSynchronizedModeGroupPrototype> swcBswSynchronizedModeGroupPrototypes;
    
    

    
    
    @XmlElement(name="SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE")
    public ArrayList<SwcBswSynchronizedModeGroupPrototype> getSwcBswSynchronizedModeGroupPrototypes() {
        return this.swcBswSynchronizedModeGroupPrototypes;
    }

    public void setSwcBswSynchronizedModeGroupPrototypes(ArrayList<SwcBswSynchronizedModeGroupPrototype> value) {
        this.swcBswSynchronizedModeGroupPrototypes = value;
    }
    
    
}