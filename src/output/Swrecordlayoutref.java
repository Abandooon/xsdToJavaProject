package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swrecordlayoutref extends Ref {

    
    
    protected SwRecordLayoutSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwRecordLayoutSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwRecordLayoutSubtypesEnum value) {
        this.dest = value;
    }
    
    
}