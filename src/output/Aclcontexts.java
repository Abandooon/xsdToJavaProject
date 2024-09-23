package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Aclcontexts {

    
    
    protected ArrayList<NmtokenString> aclContexts;
    
    

    
    
    @XmlElement(name="ACL-CONTEXT")
    public ArrayList<NmtokenString> getAclContexts() {
        return this.aclContexts;
    }

    public void setAclContexts(ArrayList<NmtokenString> value) {
        this.aclContexts = value;
    }
    
    
}