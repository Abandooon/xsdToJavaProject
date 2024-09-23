package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nvblockdescriptors {

    
    
    protected ArrayList<NvBlockDescriptor> nvBlockDescriptors;
    
    

    
    
    @XmlElement(name="NV-BLOCK-DESCRIPTOR")
    public ArrayList<NvBlockDescriptor> getNvBlockDescriptors() {
        return this.nvBlockDescriptors;
    }

    public void setNvBlockDescriptors(ArrayList<NvBlockDescriptor> value) {
        this.nvBlockDescriptors = value;
    }
    
    
}