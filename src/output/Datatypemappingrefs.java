package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Datatypemappingrefs {

    
    
    protected ArrayList<DataTypeMappingRef> dataTypeMappingRefs;
    
    

    
    
    @XmlElement(name="DATA-TYPE-MAPPING-REF")
    public ArrayList<DataTypeMappingRef> getDataTypeMappingRefs() {
        return this.dataTypeMappingRefs;
    }

    public void setDataTypeMappingRefs(ArrayList<DataTypeMappingRef> value) {
        this.dataTypeMappingRefs = value;
    }
    
    
}