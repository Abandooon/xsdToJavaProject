package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sendpolicys {

    
    
    protected ArrayList<BswDataSendPolicy> bswDataSendPolicys;
    
    

    
    
    @XmlElement(name="BSW-DATA-SEND-POLICY")
    public ArrayList<BswDataSendPolicy> getBswDataSendPolicys() {
        return this.bswDataSendPolicys;
    }

    public void setBswDataSendPolicys(ArrayList<BswDataSendPolicy> value) {
        this.bswDataSendPolicys = value;
    }
    
    
}