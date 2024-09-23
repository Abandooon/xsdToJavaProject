package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Scopeeventrefs {

    
    
    protected ArrayList<ScopeEventRef> scopeEventRefs;
    
    

    
    
    @XmlElement(name="SCOPE-EVENT-REF")
    public ArrayList<ScopeEventRef> getScopeEventRefs() {
        return this.scopeEventRefs;
    }

    public void setScopeEventRefs(ArrayList<ScopeEventRef> value) {
        this.scopeEventRefs = value;
    }
    
    
}