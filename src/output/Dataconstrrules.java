package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dataconstrrules {

    
    
    protected ArrayList<DataConstrRule> dataConstrRules;
    
    

    
    
    @XmlElement(name="DATA-CONSTR-RULE")
    public ArrayList<DataConstrRule> getDataConstrRules() {
        return this.dataConstrRules;
    }

    public void setDataConstrRules(ArrayList<DataConstrRule> value) {
        this.dataConstrRules = value;
    }
    
    
}