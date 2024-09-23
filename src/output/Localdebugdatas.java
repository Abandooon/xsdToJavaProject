package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Localdebugdatas {

    
    
    protected ArrayList<ImplementationDataTypeElement> implementationDataTypeElements;
    
    

    
    
    @XmlElement(name="IMPLEMENTATION-DATA-TYPE-ELEMENT")
    public ArrayList<ImplementationDataTypeElement> getImplementationDataTypeElements() {
        return this.implementationDataTypeElements;
    }

    public void setImplementationDataTypeElements(ArrayList<ImplementationDataTypeElement> value) {
        this.implementationDataTypeElements = value;
    }
    
    
}