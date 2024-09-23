package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Substitutedframerefs {

    
    
    protected ArrayList<SubstitutedFrameRef> substitutedFrameRefs;
    
    

    
    
    @XmlElement(name="SUBSTITUTED-FRAME-REF")
    public ArrayList<SubstitutedFrameRef> getSubstitutedFrameRefs() {
        return this.substitutedFrameRefs;
    }

    public void setSubstitutedFrameRefs(ArrayList<SubstitutedFrameRef> value) {
        this.substitutedFrameRefs = value;
    }
    
    
}