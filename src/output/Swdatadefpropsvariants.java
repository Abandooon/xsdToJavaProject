package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swdatadefpropsvariants {

    
    
    protected ArrayList<SwDataDefPropsConditional> swDataDefPropsConditionals;
    
    

    
    
    @XmlElement(name="SW-DATA-DEF-PROPS-CONDITIONAL")
    public ArrayList<SwDataDefPropsConditional> getSwDataDefPropsConditionals() {
        return this.swDataDefPropsConditionals;
    }

    public void setSwDataDefPropsConditionals(ArrayList<SwDataDefPropsConditional> value) {
        this.swDataDefPropsConditionals = value;
    }
    
    
}