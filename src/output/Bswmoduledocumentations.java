package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bswmoduledocumentations {

    
    
    protected ArrayList<SwComponentDocumentation> swComponentDocumentations;
    
    

    
    
    @XmlElement(name="SW-COMPONENT-DOCUMENTATION")
    public ArrayList<SwComponentDocumentation> getSwComponentDocumentations() {
        return this.swComponentDocumentations;
    }

    public void setSwComponentDocumentations(ArrayList<SwComponentDocumentation> value) {
        this.swComponentDocumentations = value;
    }
    
    
}