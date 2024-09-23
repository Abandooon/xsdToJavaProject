package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Usedsecondaryfidrefs {

    
    
    protected ArrayList<UsedSecondaryFidRef> usedSecondaryFidRefs;
    
    

    
    
    @XmlElement(name="USED-SECONDARY-FID-REF")
    public ArrayList<UsedSecondaryFidRef> getUsedSecondaryFidRefs() {
        return this.usedSecondaryFidRefs;
    }

    public void setUsedSecondaryFidRefs(ArrayList<UsedSecondaryFidRef> value) {
        this.usedSecondaryFidRefs = value;
    }
    
    
}