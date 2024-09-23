package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Subdomainrefs {

    
    
    protected ArrayList<SubDomainRef> subDomainRefs;
    
    

    
    
    @XmlElement(name="SUB-DOMAIN-REF")
    public ArrayList<SubDomainRef> getSubDomainRefs() {
        return this.subDomainRefs;
    }

    public void setSubDomainRefs(ArrayList<SubDomainRef> value) {
        this.subDomainRefs = value;
    }
    
    
}