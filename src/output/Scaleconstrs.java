package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Scaleconstrs {

    
    
    protected ArrayList<ScaleConstr> scaleConstrs;
    
    

    
    
    @XmlElement(name="SCALE-CONSTR")
    public ArrayList<ScaleConstr> getScaleConstrs() {
        return this.scaleConstrs;
    }

    public void setScaleConstrs(ArrayList<ScaleConstr> value) {
        this.scaleConstrs = value;
    }
    
    
}