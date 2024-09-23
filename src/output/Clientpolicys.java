package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Clientpolicys {

    
    
    protected ArrayList<BswClientPolicy> bswClientPolicys;
    
    

    
    
    @XmlElement(name="BSW-CLIENT-POLICY")
    public ArrayList<BswClientPolicy> getBswClientPolicys() {
        return this.bswClientPolicys;
    }

    public void setBswClientPolicys(ArrayList<BswClientPolicy> value) {
        this.bswClientPolicys = value;
    }
    
    
}