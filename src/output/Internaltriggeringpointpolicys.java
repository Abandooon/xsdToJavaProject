package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Internaltriggeringpointpolicys {

    
    
    protected ArrayList<BswInternalTriggeringPointPolicy> bswInternalTriggeringPointPolicys;
    
    

    
    
    @XmlElement(name="BSW-INTERNAL-TRIGGERING-POINT-POLICY")
    public ArrayList<BswInternalTriggeringPointPolicy> getBswInternalTriggeringPointPolicys() {
        return this.bswInternalTriggeringPointPolicys;
    }

    public void setBswInternalTriggeringPointPolicys(ArrayList<BswInternalTriggeringPointPolicy> value) {
        this.bswInternalTriggeringPointPolicys = value;
    }
    
    
}