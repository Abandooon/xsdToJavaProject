package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Capabilityrecords {

    
    
    protected ArrayList<TagWithOptionalValue> tagWithOptionalValues;
    
    

    
    
    @XmlElement(name="TAG-WITH-OPTIONAL-VALUE")
    public ArrayList<TagWithOptionalValue> getTagWithOptionalValues() {
        return this.tagWithOptionalValues;
    }

    public void setTagWithOptionalValues(ArrayList<TagWithOptionalValue> value) {
        this.tagWithOptionalValues = value;
    }
    
    
}