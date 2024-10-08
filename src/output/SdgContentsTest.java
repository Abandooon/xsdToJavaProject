package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SdgContentsTest {

    
    
    protected ArrayList<EncapsulatedEntryRef_SdgContents> encapsulatedEntryRefs;
    
    

    
    
    @XmlElement(name="ENCAPSULATED-ENTRY-REF")
    public ArrayList<EncapsulatedEntryRef_SdgContents> getEncapsulatedEntryRefs() {
        return this.encapsulatedEntryRefs;
    }

    public void setEncapsulatedEntryRefs(ArrayList<EncapsulatedEntryRef_SdgContents> value) {
        this.encapsulatedEntryRefs = value;
    }
    
    
}