package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dataidentifierrefs {

    
    
    protected ArrayList<DataIdentifierRef> dataIdentifierRefs;
    
    

    
    
    @XmlElement(name="DATA-IDENTIFIER-REF")
    public ArrayList<DataIdentifierRef> getDataIdentifierRefs() {
        return this.dataIdentifierRefs;
    }

    public void setDataIdentifierRefs(ArrayList<DataIdentifierRef> value) {
        this.dataIdentifierRefs = value;
    }
    
    
}