package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Activationpoints {

    
    
    protected ArrayList<BswInternalTriggeringPointRefConditional> bswInternalTriggeringPointRefConditionals;
    
    

    
    
    @XmlElement(name="BSW-INTERNAL-TRIGGERING-POINT-REF-CONDITIONAL")
    public ArrayList<BswInternalTriggeringPointRefConditional> getBswInternalTriggeringPointRefConditionals() {
        return this.bswInternalTriggeringPointRefConditionals;
    }

    public void setBswInternalTriggeringPointRefConditionals(ArrayList<BswInternalTriggeringPointRefConditional> value) {
        this.bswInternalTriggeringPointRefConditionals = value;
    }
    
    
}