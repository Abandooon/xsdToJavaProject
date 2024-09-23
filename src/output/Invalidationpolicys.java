package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Invalidationpolicys {

    
    
    protected ArrayList<InvalidationPolicy> invalidationPolicys;
    
    

    
    
    @XmlElement(name="INVALIDATION-POLICY")
    public ArrayList<InvalidationPolicy> getInvalidationPolicys() {
        return this.invalidationPolicys;
    }

    public void setInvalidationPolicys(ArrayList<InvalidationPolicy> value) {
        this.invalidationPolicys = value;
    }
    
    
}