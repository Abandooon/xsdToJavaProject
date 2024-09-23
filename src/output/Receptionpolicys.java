package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Receptionpolicys {

    
    
    protected ArrayList<BswQueuedDataReceptionPolicy> bswQueuedDataReceptionPolicys;
    
    

    
    
    @XmlElement(name="BSW-QUEUED-DATA-RECEPTION-POLICY")
    public ArrayList<BswQueuedDataReceptionPolicy> getBswQueuedDataReceptionPolicys() {
        return this.bswQueuedDataReceptionPolicys;
    }

    public void setBswQueuedDataReceptionPolicys(ArrayList<BswQueuedDataReceptionPolicy> value) {
        this.bswQueuedDataReceptionPolicys = value;
    }
    
    
}