package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Teardownactionrefs {

    
    
    protected ArrayList<TearDownActionRef> tearDownActionRefs;
    
    

    
    
    @XmlElement(name="TEAR-DOWN-ACTION-REF")
    public ArrayList<TearDownActionRef> getTearDownActionRefs() {
        return this.tearDownActionRefs;
    }

    public void setTearDownActionRefs(ArrayList<TearDownActionRef> value) {
        this.tearDownActionRefs = value;
    }
    
    
}