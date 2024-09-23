package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Exclusiveareas {

    
    
    protected ArrayList<ExclusiveArea> exclusiveAreas;
    
    

    
    
    @XmlElement(name="EXCLUSIVE-AREA")
    public ArrayList<ExclusiveArea> getExclusiveAreas() {
        return this.exclusiveAreas;
    }

    public void setExclusiveAreas(ArrayList<ExclusiveArea> value) {
        this.exclusiveAreas = value;
    }
    
    
}