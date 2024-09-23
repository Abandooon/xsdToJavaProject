package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dtcpropsref extends Ref {

    
    
    protected DiagnosticTroubleCodePropsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticTroubleCodePropsSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticTroubleCodePropsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}