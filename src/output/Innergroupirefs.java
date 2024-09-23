package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Innergroupirefs {

    
    
    protected ArrayList<InnerPortGroupInCompositionInstanceRef> innerGroupIrefs;
    
    

    
    
    @XmlElement(name="INNER-GROUP-IREF")
    public ArrayList<InnerPortGroupInCompositionInstanceRef> getInnerGroupIrefs() {
        return this.innerGroupIrefs;
    }

    public void setInnerGroupIrefs(ArrayList<InnerPortGroupInCompositionInstanceRef> value) {
        this.innerGroupIrefs = value;
    }
    
    
}