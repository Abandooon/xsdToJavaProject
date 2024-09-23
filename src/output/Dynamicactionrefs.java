package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dynamicactionrefs {

    
    
    protected ArrayList<DynamicActionRef> dynamicActionRefs;
    
    

    
    
    @XmlElement(name="DYNAMIC-ACTION-REF")
    public ArrayList<DynamicActionRef> getDynamicActionRefs() {
        return this.dynamicActionRefs;
    }

    public void setDynamicActionRefs(ArrayList<DynamicActionRef> value) {
        this.dynamicActionRefs = value;
    }
    
    
}