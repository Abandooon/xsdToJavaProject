package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Mcdatainstancerefs {

    
    
    protected ArrayList<McDataInstanceRef> mcDataInstanceRefs;
    
    

    
    
    @XmlElement(name="MC-DATA-INSTANCE-REF")
    public ArrayList<McDataInstanceRef> getMcDataInstanceRefs() {
        return this.mcDataInstanceRefs;
    }

    public void setMcDataInstanceRefs(ArrayList<McDataInstanceRef> value) {
        this.mcDataInstanceRefs = value;
    }
    
    
}