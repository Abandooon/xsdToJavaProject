package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Relatedtraceitemref extends Ref {

    
    
    protected TraceableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TraceableSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TraceableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}