package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modereceiverpolicys {

    
    
    protected ArrayList<BswModeReceiverPolicy> bswModeReceiverPolicys;
    
    

    
    
    @XmlElement(name="BSW-MODE-RECEIVER-POLICY")
    public ArrayList<BswModeReceiverPolicy> getBswModeReceiverPolicys() {
        return this.bswModeReceiverPolicys;
    }

    public void setBswModeReceiverPolicys(ArrayList<BswModeReceiverPolicy> value) {
        this.bswModeReceiverPolicys = value;
    }
    
    
}