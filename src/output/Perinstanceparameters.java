package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Perinstanceparameters {

    
    
    protected ArrayList<ParameterDataPrototype> parameterDataPrototypes;
    
    

    
    
    @XmlElement(name="PARAMETER-DATA-PROTOTYPE")
    public ArrayList<ParameterDataPrototype> getParameterDataPrototypes() {
        return this.parameterDataPrototypes;
    }

    public void setParameterDataPrototypes(ArrayList<ParameterDataPrototype> value) {
        this.parameterDataPrototypes = value;
    }
    
    
}