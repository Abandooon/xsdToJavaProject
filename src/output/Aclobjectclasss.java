package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Aclobjectclasss {

    
    
    protected ArrayList<ReferrableSubtypesEnum> aclObjectClasss;
    
    

    
    
    @XmlElement(name="ACL-OBJECT-CLASS")
    public ArrayList<ReferrableSubtypesEnum> getAclObjectClasss() {
        return this.aclObjectClasss;
    }

    public void setAclObjectClasss(ArrayList<ReferrableSubtypesEnum> value) {
        this.aclObjectClasss = value;
    }
    
    
}