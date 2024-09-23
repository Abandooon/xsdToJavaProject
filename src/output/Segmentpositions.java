package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Segmentpositions {

    
    
    protected ArrayList<SegmentPosition> segmentPositions;
    
    

    
    
    @XmlElement(name="SEGMENT-POSITION")
    public ArrayList<SegmentPosition> getSegmentPositions() {
        return this.segmentPositions;
    }

    public void setSegmentPositions(ArrayList<SegmentPosition> value) {
        this.segmentPositions = value;
    }
    
    
}