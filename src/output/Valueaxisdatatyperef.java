package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Valueaxisdatatyperef extends Ref {

    
    
    protected ApplicationPrimitiveDataTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationPrimitiveDataTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ApplicationPrimitiveDataTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}