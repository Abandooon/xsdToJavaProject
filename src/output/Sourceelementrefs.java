package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sourceelementrefs {

    
    
    protected ArrayList<SourceElementRef> sourceElementRefs;
    
    

    
    
    @XmlElement(name="SOURCE-ELEMENT-REF")
    public ArrayList<SourceElementRef> getSourceElementRefs() {
        return this.sourceElementRefs;
    }

    public void setSourceElementRefs(ArrayList<SourceElementRef> value) {
        this.sourceElementRefs = value;
    }
    
    
}