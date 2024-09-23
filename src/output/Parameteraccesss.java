package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Parameteraccesss {

    
    
    protected ArrayList<ParameterAccess> parameterAccesss;
    
    

    
    
    @XmlElement(name="PARAMETER-ACCESS")
    public ArrayList<ParameterAccess> getParameterAccesss() {
        return this.parameterAccesss;
    }

    public void setParameterAccesss(ArrayList<ParameterAccess> value) {
        this.parameterAccesss = value;
    }
    
    
}