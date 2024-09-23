package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sourceinstanceirefs {

    
    
    protected ArrayList<AnyInstanceRef> sourceInstanceIrefs;
    
    

    
    
    @XmlElement(name="SOURCE-INSTANCE-IREF")
    public ArrayList<AnyInstanceRef> getSourceInstanceIrefs() {
        return this.sourceInstanceIrefs;
    }

    public void setSourceInstanceIrefs(ArrayList<AnyInstanceRef> value) {
        this.sourceInstanceIrefs = value;
    }
    
    
}