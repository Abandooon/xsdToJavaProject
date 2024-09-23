package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Segmentrefs {

    
    
    protected ArrayList<SegmentRef> segmentRefs;
    
    

    
    
    @XmlElement(name="SEGMENT-REF")
    public ArrayList<SegmentRef> getSegmentRefs() {
        return this.segmentRefs;
    }

    public void setSegmentRefs(ArrayList<SegmentRef> value) {
        this.segmentRefs = value;
    }
    
    
}