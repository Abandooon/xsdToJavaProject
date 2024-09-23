package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pncgrouprefs {

    
    
    protected ArrayList<PncGroupRef> pncGroupRefs;
    
    

    
    
    @XmlElement(name="PNC-GROUP-REF")
    public ArrayList<PncGroupRef> getPncGroupRefs() {
        return this.pncGroupRefs;
    }

    public void setPncGroupRefs(ArrayList<PncGroupRef> value) {
        this.pncGroupRefs = value;
    }
    
    
}