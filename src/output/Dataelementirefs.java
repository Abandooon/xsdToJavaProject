package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dataelementirefs {

    
    
    protected ArrayList<VariableDataPrototypeInSystemInstanceRef> dataElementIrefs;
    
    

    
    
    @XmlElement(name="DATA-ELEMENT-IREF")
    public ArrayList<VariableDataPrototypeInSystemInstanceRef> getDataElementIrefs() {
        return this.dataElementIrefs;
    }

    public void setDataElementIrefs(ArrayList<VariableDataPrototypeInSystemInstanceRef> value) {
        this.dataElementIrefs = value;
    }
    
    
}