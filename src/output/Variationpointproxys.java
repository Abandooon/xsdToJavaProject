package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Variationpointproxys {

    
    
    protected ArrayList<VariationPointProxy> variationPointProxys;
    
    

    
    
    @XmlElement(name="VARIATION-POINT-PROXY")
    public ArrayList<VariationPointProxy> getVariationPointProxys() {
        return this.variationPointProxys;
    }

    public void setVariationPointProxys(ArrayList<VariationPointProxy> value) {
        this.variationPointProxys = value;
    }
    
    
}