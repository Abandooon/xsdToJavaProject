package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nvblockdatamappings {

    
    
    protected ArrayList<NvBlockDataMapping> nvBlockDataMappings;
    
    

    
    
    @XmlElement(name="NV-BLOCK-DATA-MAPPING")
    public ArrayList<NvBlockDataMapping> getNvBlockDataMappings() {
        return this.nvBlockDataMappings;
    }

    public void setNvBlockDataMappings(ArrayList<NvBlockDataMapping> value) {
        this.nvBlockDataMappings = value;
    }
    
    
}