package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Exclusiveareapolicys {

    
    
    protected ArrayList<BswExclusiveAreaPolicy> bswExclusiveAreaPolicys;
    
    

    
    
    @XmlElement(name="BSW-EXCLUSIVE-AREA-POLICY")
    public ArrayList<BswExclusiveAreaPolicy> getBswExclusiveAreaPolicys() {
        return this.bswExclusiveAreaPolicys;
    }

    public void setBswExclusiveAreaPolicys(ArrayList<BswExclusiveAreaPolicy> value) {
        this.bswExclusiveAreaPolicys = value;
    }
    
    
}