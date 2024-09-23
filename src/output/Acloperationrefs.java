package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Acloperationrefs {

    
    
    protected ArrayList<AclOperationRef> aclOperationRefs;
    
    

    
    
    @XmlElement(name="ACL-OPERATION-REF")
    public ArrayList<AclOperationRef> getAclOperationRefs() {
        return this.aclOperationRefs;
    }

    public void setAclOperationRefs(ArrayList<AclOperationRef> value) {
        this.aclOperationRefs = value;
    }
    
    
}