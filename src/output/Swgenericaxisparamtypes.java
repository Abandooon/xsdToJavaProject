package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swgenericaxisparamtypes {

    
    
    protected ArrayList<SwGenericAxisParamType> swGenericAxisParamTypes;
    
    

    
    
    @XmlElement(name="SW-GENERIC-AXIS-PARAM-TYPE")
    public ArrayList<SwGenericAxisParamType> getSwGenericAxisParamTypes() {
        return this.swGenericAxisParamTypes;
    }

    public void setSwGenericAxisParamTypes(ArrayList<SwGenericAxisParamType> value) {
        this.swGenericAxisParamTypes = value;
    }
    
    
}