package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Scoperefs {

    
    
    protected ArrayList<ScopeRef> scopeRefs;
    
    

    
    
    @XmlElement(name="SCOPE-REF")
    public ArrayList<ScopeRef> getScopeRefs() {
        return this.scopeRefs;
    }

    public void setScopeRefs(ArrayList<ScopeRef> value) {
        this.scopeRefs = value;
    }
    
    
}