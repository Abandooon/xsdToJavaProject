package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Datareceivepoints {

    
    
    protected ArrayList<BswVariableAccess> bswVariableAccesss;
    
    

    
    
    @XmlElement(name="BSW-VARIABLE-ACCESS")
    public ArrayList<BswVariableAccess> getBswVariableAccesss() {
        return this.bswVariableAccesss;
    }

    public void setBswVariableAccesss(ArrayList<BswVariableAccess> value) {
        this.bswVariableAccesss = value;
    }
    
    
}