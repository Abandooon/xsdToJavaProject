package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Runnablemappings {

    
    
    protected ArrayList<SwcBswRunnableMapping> swcBswRunnableMappings;
    
    

    
    
    @XmlElement(name="SWC-BSW-RUNNABLE-MAPPING")
    public ArrayList<SwcBswRunnableMapping> getSwcBswRunnableMappings() {
        return this.swcBswRunnableMappings;
    }

    public void setSwcBswRunnableMappings(ArrayList<SwcBswRunnableMapping> value) {
        this.swcBswRunnableMappings = value;
    }
    
    
}