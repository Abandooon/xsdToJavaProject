package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Releasedtriggerpolicys {

    
    
    protected ArrayList<BswReleasedTriggerPolicy> bswReleasedTriggerPolicys;
    
    

    
    
    @XmlElement(name="BSW-RELEASED-TRIGGER-POLICY")
    public ArrayList<BswReleasedTriggerPolicy> getBswReleasedTriggerPolicys() {
        return this.bswReleasedTriggerPolicys;
    }

    public void setBswReleasedTriggerPolicys(ArrayList<BswReleasedTriggerPolicy> value) {
        this.bswReleasedTriggerPolicys = value;
    }
    
    
}