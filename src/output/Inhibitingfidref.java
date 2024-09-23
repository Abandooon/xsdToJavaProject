package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Inhibitingfidref extends Ref {

    
    
    protected FunctionInhibitionNeedsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FunctionInhibitionNeedsSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FunctionInhibitionNeedsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}