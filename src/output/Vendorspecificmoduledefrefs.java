package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Vendorspecificmoduledefrefs {

    
    
    protected ArrayList<VendorSpecificModuleDefRef> vendorSpecificModuleDefRefs;
    
    

    
    
    @XmlElement(name="VENDOR-SPECIFIC-MODULE-DEF-REF")
    public ArrayList<VendorSpecificModuleDefRef> getVendorSpecificModuleDefRefs() {
        return this.vendorSpecificModuleDefRefs;
    }

    public void setVendorSpecificModuleDefRefs(ArrayList<VendorSpecificModuleDefRef> value) {
        this.vendorSpecificModuleDefRefs = value;
    }
    
    
}