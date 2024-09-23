package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Affectedrefs {

    
    
    protected ArrayList<AffectedRef> affectedRefs;
    
    

    
    
    @XmlElement(name="AFFECTED-REF")
    public ArrayList<AffectedRef> getAffectedRefs() {
        return this.affectedRefs;
    }

    public void setAffectedRefs(ArrayList<AffectedRef> value) {
        this.affectedRefs = value;
    }
    
    
}