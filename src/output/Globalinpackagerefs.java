package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Globalinpackagerefs {

    
    
    protected ArrayList<GlobalInPackageRef> globalInPackageRefs;
    
    

    
    
    @XmlElement(name="GLOBAL-IN-PACKAGE-REF")
    public ArrayList<GlobalInPackageRef> getGlobalInPackageRefs() {
        return this.globalInPackageRefs;
    }

    public void setGlobalInPackageRefs(ArrayList<GlobalInPackageRef> value) {
        this.globalInPackageRefs = value;
    }
    
    
}