package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Implicitdataaccessirefs {

    
    
    protected ArrayList<VariableDataPrototypeInCompositionInstanceRef> implicitDataAccessIrefs;
    
    

    
    
    @XmlElement(name="IMPLICIT-DATA-ACCESS-IREF")
    public ArrayList<VariableDataPrototypeInCompositionInstanceRef> getImplicitDataAccessIrefs() {
        return this.implicitDataAccessIrefs;
    }

    public void setImplicitDataAccessIrefs(ArrayList<VariableDataPrototypeInCompositionInstanceRef> value) {
        this.implicitDataAccessIrefs = value;
    }
    
    
}