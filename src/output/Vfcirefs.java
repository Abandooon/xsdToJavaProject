package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Vfcirefs {

    
    
    protected ArrayList<PortGroupInSystemInstanceRef> vfcIrefs;
    
    

    
    
    @XmlElement(name="VFC-IREF")
    public ArrayList<PortGroupInSystemInstanceRef> getVfcIrefs() {
        return this.vfcIrefs;
    }

    public void setVfcIrefs(ArrayList<PortGroupInSystemInstanceRef> value) {
        this.vfcIrefs = value;
    }
    
    
}