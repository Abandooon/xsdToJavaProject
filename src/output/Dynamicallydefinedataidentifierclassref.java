package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dynamicallydefinedataidentifierclassref extends Ref {

    
    
    protected DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}