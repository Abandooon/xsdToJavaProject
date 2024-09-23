package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Secondelements {

    
    
    protected ArrayList<ApplicationCompositeDataTypeSubElementRef> applicationCompositeDataTypeSubElementRefs;
    
    
    
    protected ArrayList<ImplementationDataTypeSubElementRef> implementationDataTypeSubElementRefs;
    
    

    
    
    @XmlElement(name="APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF")
    public ArrayList<ApplicationCompositeDataTypeSubElementRef> getApplicationCompositeDataTypeSubElementRefs() {
        return this.applicationCompositeDataTypeSubElementRefs;
    }

    public void setApplicationCompositeDataTypeSubElementRefs(ArrayList<ApplicationCompositeDataTypeSubElementRef> value) {
        this.applicationCompositeDataTypeSubElementRefs = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF")
    public ArrayList<ImplementationDataTypeSubElementRef> getImplementationDataTypeSubElementRefs() {
        return this.implementationDataTypeSubElementRefs;
    }

    public void setImplementationDataTypeSubElementRefs(ArrayList<ImplementationDataTypeSubElementRef> value) {
        this.implementationDataTypeSubElementRefs = value;
    }
    
    
}