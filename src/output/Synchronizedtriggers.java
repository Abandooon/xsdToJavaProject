package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Synchronizedtriggers {

    
    
    protected ArrayList<SwcBswSynchronizedTrigger> swcBswSynchronizedTriggers;
    
    

    
    
    @XmlElement(name="SWC-BSW-SYNCHRONIZED-TRIGGER")
    public ArrayList<SwcBswSynchronizedTrigger> getSwcBswSynchronizedTriggers() {
        return this.swcBswSynchronizedTriggers;
    }

    public void setSwcBswSynchronizedTriggers(ArrayList<SwcBswSynchronizedTrigger> value) {
        this.swcBswSynchronizedTriggers = value;
    }
    
    
}