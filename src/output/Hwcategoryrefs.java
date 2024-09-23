package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwcategoryrefs {

    
    
    protected ArrayList<HwCategoryRef> hwCategoryRefs;
    
    

    
    
    @XmlElement(name="HW-CATEGORY-REF")
    public ArrayList<HwCategoryRef> getHwCategoryRefs() {
        return this.hwCategoryRefs;
    }

    public void setHwCategoryRefs(ArrayList<HwCategoryRef> value) {
        this.hwCategoryRefs = value;
    }
    
    
}