package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Componentirefs {

    
    
    protected ArrayList<ComponentInSystemInstanceRef> componentIrefs;
    
    

    
    
    @XmlElement(name="COMPONENT-IREF")
    public ArrayList<ComponentInSystemInstanceRef> getComponentIrefs() {
        return this.componentIrefs;
    }

    public void setComponentIrefs(ArrayList<ComponentInSystemInstanceRef> value) {
        this.componentIrefs = value;
    }
    
    
}