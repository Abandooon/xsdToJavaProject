package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Flatmapentryrefs {

    
    
    protected ArrayList<FlatMapEntryRef> flatMapEntryRefs;
    
    

    
    
    @XmlElement(name="FLAT-MAP-ENTRY-REF")
    public ArrayList<FlatMapEntryRef> getFlatMapEntryRefs() {
        return this.flatMapEntryRefs;
    }

    public void setFlatMapEntryRefs(ArrayList<FlatMapEntryRef> value) {
        this.flatMapEntryRefs = value;
    }
    
    
}