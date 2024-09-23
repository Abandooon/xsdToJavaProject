package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Prefixref extends Ref {

    
    
    protected SectionNamePrefixSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SectionNamePrefixSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SectionNamePrefixSubtypesEnum value) {
        this.dest = value;
    }
    
    
}