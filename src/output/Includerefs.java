package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Includerefs {

    
    
    protected ArrayList<IncludeRef> includeRefs;
    
    

    
    
    @XmlElement(name="INCLUDE-REF")
    public ArrayList<IncludeRef> getIncludeRefs() {
        return this.includeRefs;
    }

    public void setIncludeRefs(ArrayList<IncludeRef> value) {
        this.includeRefs = value;
    }
    
    
}