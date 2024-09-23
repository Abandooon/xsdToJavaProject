package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Securitylevelrefs {

    
    
    protected ArrayList<SecurityLevelRef> securityLevelRefs;
    
    

    
    
    @XmlElement(name="SECURITY-LEVEL-REF")
    public ArrayList<SecurityLevelRef> getSecurityLevelRefs() {
        return this.securityLevelRefs;
    }

    public void setSecurityLevelRefs(ArrayList<SecurityLevelRef> value) {
        this.securityLevelRefs = value;
    }
    
    
}