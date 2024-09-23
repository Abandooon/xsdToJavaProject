package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Aclrolerefs {

    
    
    protected ArrayList<AclRoleRef> aclRoleRefs;
    
    

    
    
    @XmlElement(name="ACL-ROLE-REF")
    public ArrayList<AclRoleRef> getAclRoleRefs() {
        return this.aclRoleRefs;
    }

    public void setAclRoleRefs(ArrayList<AclRoleRef> value) {
        this.aclRoleRefs = value;
    }
    
    
}