package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Datatyperefs {

    
    
    protected ArrayList<DataTypeRef> dataTypeRefs;
    
    

    
    
    @XmlElement(name="DATA-TYPE-REF")
    public ArrayList<DataTypeRef> getDataTypeRefs() {
        return this.dataTypeRefs;
    }

    public void setDataTypeRefs(ArrayList<DataTypeRef> value) {
        this.dataTypeRefs = value;
    }
    
    
}