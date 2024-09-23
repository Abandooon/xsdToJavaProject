package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Subfunctionrefs {

    
    
    protected ArrayList<SubFunctionRef> subFunctionRefs;
    
    

    
    
    @XmlElement(name="SUB-FUNCTION-REF")
    public ArrayList<SubFunctionRef> getSubFunctionRefs() {
        return this.subFunctionRefs;
    }

    public void setSubFunctionRefs(ArrayList<SubFunctionRef> value) {
        this.subFunctionRefs = value;
    }
    
    
}