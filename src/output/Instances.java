package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Instances {

    
    
    protected ArrayList<FlatInstanceDescriptor> flatInstanceDescriptors;
    
    

    
    
    @XmlElement(name="FLAT-INSTANCE-DESCRIPTOR")
    public ArrayList<FlatInstanceDescriptor> getFlatInstanceDescriptors() {
        return this.flatInstanceDescriptors;
    }

    public void setFlatInstanceDescriptors(ArrayList<FlatInstanceDescriptor> value) {
        this.flatInstanceDescriptors = value;
    }
    
    
}