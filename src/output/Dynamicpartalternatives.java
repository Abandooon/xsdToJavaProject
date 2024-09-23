package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dynamicpartalternatives {

    
    
    protected ArrayList<DynamicPartAlternative> dynamicPartAlternatives;
    
    

    
    
    @XmlElement(name="DYNAMIC-PART-ALTERNATIVE")
    public ArrayList<DynamicPartAlternative> getDynamicPartAlternatives() {
        return this.dynamicPartAlternatives;
    }

    public void setDynamicPartAlternatives(ArrayList<DynamicPartAlternative> value) {
        this.dynamicPartAlternatives = value;
    }
    
    
}