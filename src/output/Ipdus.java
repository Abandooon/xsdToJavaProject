package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ipdus {

    
    
    protected ArrayList<PduTriggeringRefConditional> pduTriggeringRefConditionals;
    
    

    
    
    @XmlElement(name="PDU-TRIGGERING-REF-CONDITIONAL")
    public ArrayList<PduTriggeringRefConditional> getPduTriggeringRefConditionals() {
        return this.pduTriggeringRefConditionals;
    }

    public void setPduTriggeringRefConditionals(ArrayList<PduTriggeringRefConditional> value) {
        this.pduTriggeringRefConditionals = value;
    }
    
    
}