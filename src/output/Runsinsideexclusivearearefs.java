package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Runsinsideexclusivearearefs {

    
    
    protected ArrayList<RunsInsideExclusiveAreaRef> runsInsideExclusiveAreaRefs;
    
    

    
    
    @XmlElement(name="RUNS-INSIDE-EXCLUSIVE-AREA-REF")
    public ArrayList<RunsInsideExclusiveAreaRef> getRunsInsideExclusiveAreaRefs() {
        return this.runsInsideExclusiveAreaRefs;
    }

    public void setRunsInsideExclusiveAreaRefs(ArrayList<RunsInsideExclusiveAreaRef> value) {
        this.runsInsideExclusiveAreaRefs = value;
    }
    
    
}