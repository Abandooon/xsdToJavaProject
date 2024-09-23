package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Datatransformationref extends Ref {

    
    
    protected DataTransformationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataTransformationSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DataTransformationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}