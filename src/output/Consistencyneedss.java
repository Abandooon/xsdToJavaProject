package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Consistencyneedss {

    
    
    protected ArrayList<ConsistencyNeeds> consistencyNeedss;
    
    

    
    
    @XmlElement(name="CONSISTENCY-NEEDS")
    public ArrayList<ConsistencyNeeds> getConsistencyNeedss() {
        return this.consistencyNeedss;
    }

    public void setConsistencyNeedss(ArrayList<ConsistencyNeeds> value) {
        this.consistencyNeedss = value;
    }
    
    
}