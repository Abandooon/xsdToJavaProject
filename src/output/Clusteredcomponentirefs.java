package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Clusteredcomponentirefs {

    
    
    protected ArrayList<ComponentInSystemInstanceRef> clusteredComponentIrefs;
    
    

    
    
    @XmlElement(name="CLUSTERED-COMPONENT-IREF")
    public ArrayList<ComponentInSystemInstanceRef> getClusteredComponentIrefs() {
        return this.clusteredComponentIrefs;
    }

    public void setClusteredComponentIrefs(ArrayList<ComponentInSystemInstanceRef> value) {
        this.clusteredComponentIrefs = value;
    }
    
    
}