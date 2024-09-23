package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Aclobjectrefs {

    
    
    protected ArrayList<AclObjectRef> aclObjectRefs;
    
    

    
    
    @XmlElement(name="ACL-OBJECT-REF")
    public ArrayList<AclObjectRef> getAclObjectRefs() {
        return this.aclObjectRefs;
    }

    public void setAclObjectRefs(ArrayList<AclObjectRef> value) {
        this.aclObjectRefs = value;
    }
    
    
}