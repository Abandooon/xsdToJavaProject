package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modesenderpolicys {

    
    
    protected ArrayList<BswModeSenderPolicy> bswModeSenderPolicys;
    
    

    
    
    @XmlElement(name="BSW-MODE-SENDER-POLICY")
    public ArrayList<BswModeSenderPolicy> getBswModeSenderPolicys() {
        return this.bswModeSenderPolicys;
    }

    public void setBswModeSenderPolicys(ArrayList<BswModeSenderPolicy> value) {
        this.bswModeSenderPolicys = value;
    }
    
    
}