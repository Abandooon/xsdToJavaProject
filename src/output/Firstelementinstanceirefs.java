package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Firstelementinstanceirefs {

    
    
    protected ArrayList<AnyInstanceRef> firstElementInstanceIrefs;
    
    

    
    
    @XmlElement(name="FIRST-ELEMENT-INSTANCE-IREF")
    public ArrayList<AnyInstanceRef> getFirstElementInstanceIrefs() {
        return this.firstElementInstanceIrefs;
    }

    public void setFirstElementInstanceIrefs(ArrayList<AnyInstanceRef> value) {
        this.firstElementInstanceIrefs = value;
    }
    
    
}