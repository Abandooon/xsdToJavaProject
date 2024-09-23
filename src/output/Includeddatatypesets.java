package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Includeddatatypesets {

    
    
    protected ArrayList<IncludedDataTypeSet> includedDataTypeSets;
    
    

    
    
    @XmlElement(name="INCLUDED-DATA-TYPE-SET")
    public ArrayList<IncludedDataTypeSet> getIncludedDataTypeSets() {
        return this.includedDataTypeSets;
    }

    public void setIncludedDataTypeSets(ArrayList<IncludedDataTypeSet> value) {
        this.includedDataTypeSets = value;
    }
    
    
}