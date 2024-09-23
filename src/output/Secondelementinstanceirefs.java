package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Secondelementinstanceirefs {

    
    
    protected ArrayList<AnyInstanceRef> secondElementInstanceIrefs;
    
    

    
    
    @XmlElement(name="SECOND-ELEMENT-INSTANCE-IREF")
    public ArrayList<AnyInstanceRef> getSecondElementInstanceIrefs() {
        return this.secondElementInstanceIrefs;
    }

    public void setSecondElementInstanceIrefs(ArrayList<AnyInstanceRef> value) {
        this.secondElementInstanceIrefs = value;
    }
    
    
}