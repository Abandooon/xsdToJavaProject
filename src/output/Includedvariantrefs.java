package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Includedvariantrefs {

    
    
    protected ArrayList<IncludedVariantRef> includedVariantRefs;
    
    

    
    
    @XmlElement(name="INCLUDED-VARIANT-REF")
    public ArrayList<IncludedVariantRef> getIncludedVariantRefs() {
        return this.includedVariantRefs;
    }

    public void setIncludedVariantRefs(ArrayList<IncludedVariantRef> value) {
        this.includedVariantRefs = value;
    }
    
    
}