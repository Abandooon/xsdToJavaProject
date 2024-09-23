package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Unitgrouprefs {

    
    
    protected ArrayList<UnitGroupRef> unitGroupRefs;
    
    

    
    
    @XmlElement(name="UNIT-GROUP-REF")
    public ArrayList<UnitGroupRef> getUnitGroupRefs() {
        return this.unitGroupRefs;
    }

    public void setUnitGroupRefs(ArrayList<UnitGroupRef> value) {
        this.unitGroupRefs = value;
    }
    
    
}