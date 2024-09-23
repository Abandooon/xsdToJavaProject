package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Debouncealgorithmref extends Ref {

    
    
    protected DiagnosticDebounceAlgorithmPropsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDebounceAlgorithmPropsSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticDebounceAlgorithmPropsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}