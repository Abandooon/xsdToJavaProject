package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Exclusiveareanestingorderrefs {

    
    
    protected ArrayList<ExclusiveAreaNestingOrderRef> exclusiveAreaNestingOrderRefs;
    
    

    
    
    @XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDER-REF")
    public ArrayList<ExclusiveAreaNestingOrderRef> getExclusiveAreaNestingOrderRefs() {
        return this.exclusiveAreaNestingOrderRefs;
    }

    public void setExclusiveAreaNestingOrderRefs(ArrayList<ExclusiveAreaNestingOrderRef> value) {
        this.exclusiveAreaNestingOrderRefs = value;
    }
    
    
}