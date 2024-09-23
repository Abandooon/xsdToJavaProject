package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Canenterexclusivearearefs {

    
    
    protected ArrayList<CanEnterExclusiveAreaRef> canEnterExclusiveAreaRefs;
    
    

    
    
    @XmlElement(name="CAN-ENTER-EXCLUSIVE-AREA-REF")
    public ArrayList<CanEnterExclusiveAreaRef> getCanEnterExclusiveAreaRefs() {
        return this.canEnterExclusiveAreaRefs;
    }

    public void setCanEnterExclusiveAreaRefs(ArrayList<CanEnterExclusiveAreaRef> value) {
        this.canEnterExclusiveAreaRefs = value;
    }
    
    
}