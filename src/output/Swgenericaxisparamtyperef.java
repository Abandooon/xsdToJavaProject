package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swgenericaxisparamtyperef extends Ref {

    
    
    protected SwGenericAxisParamTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwGenericAxisParamTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwGenericAxisParamTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}