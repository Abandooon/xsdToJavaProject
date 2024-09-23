package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Parameteraccessedfordebugrefs {

    
    
    protected ArrayList<ParameterAccessedForDebugRef> parameterAccessedForDebugRefs;
    
    

    
    
    @XmlElement(name="PARAMETER-ACCESSED-FOR-DEBUG-REF")
    public ArrayList<ParameterAccessedForDebugRef> getParameterAccessedForDebugRefs() {
        return this.parameterAccessedForDebugRefs;
    }

    public void setParameterAccessedForDebugRefs(ArrayList<ParameterAccessedForDebugRef> value) {
        this.parameterAccessedForDebugRefs = value;
    }
    
    
}