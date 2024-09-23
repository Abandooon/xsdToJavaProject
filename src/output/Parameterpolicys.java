package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Parameterpolicys {

    
    
    protected ArrayList<BswParameterPolicy> bswParameterPolicys;
    
    

    
    
    @XmlElement(name="BSW-PARAMETER-POLICY")
    public ArrayList<BswParameterPolicy> getBswParameterPolicys() {
        return this.bswParameterPolicys;
    }

    public void setBswParameterPolicys(ArrayList<BswParameterPolicy> value) {
        this.bswParameterPolicys = value;
    }
    
    
}