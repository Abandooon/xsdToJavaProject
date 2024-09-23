package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Separatedcomponentirefs {

    
    
    protected ArrayList<ComponentInSystemInstanceRef> separatedComponentIrefs;
    
    

    
    
    @XmlElement(name="SEPARATED-COMPONENT-IREF")
    public ArrayList<ComponentInSystemInstanceRef> getSeparatedComponentIrefs() {
        return this.separatedComponentIrefs;
    }

    public void setSeparatedComponentIrefs(ArrayList<ComponentInSystemInstanceRef> value) {
        this.separatedComponentIrefs = value;
    }
    
    
}