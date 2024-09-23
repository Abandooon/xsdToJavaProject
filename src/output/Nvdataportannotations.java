package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nvdataportannotations {

    
    
    protected ArrayList<NvDataPortAnnotation> nvDataPortAnnotations;
    
    

    
    
    @XmlElement(name="NV-DATA-PORT-ANNOTATION")
    public ArrayList<NvDataPortAnnotation> getNvDataPortAnnotations() {
        return this.nvDataPortAnnotations;
    }

    public void setNvDataPortAnnotations(ArrayList<NvDataPortAnnotation> value) {
        this.nvDataPortAnnotations = value;
    }
    
    
}