package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Scheduletables {

    
    
    protected ArrayList<LinScheduleTable> linScheduleTables;
    
    

    
    
    @XmlElement(name="LIN-SCHEDULE-TABLE")
    public ArrayList<LinScheduleTable> getLinScheduleTables() {
        return this.linScheduleTables;
    }

    public void setLinScheduleTables(ArrayList<LinScheduleTable> value) {
        this.linScheduleTables = value;
    }
    
    
}