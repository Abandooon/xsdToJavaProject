package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Instantiationdatadefpropss {

    
    
    protected ArrayList<InstantiationDataDefProps> instantiationDataDefPropss;
    
    

    
    
    @XmlElement(name="INSTANTIATION-DATA-DEF-PROPS")
    public ArrayList<InstantiationDataDefProps> getInstantiationDataDefPropss() {
        return this.instantiationDataDefPropss;
    }

    public void setInstantiationDataDefPropss(ArrayList<InstantiationDataDefProps> value) {
        this.instantiationDataDefPropss = value;
    }
    
    
}