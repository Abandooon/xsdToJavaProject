package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Readdtcinformationclassref extends Ref {

    
    
    protected DiagnosticReadDtcInformationClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticReadDtcInformationClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticReadDtcInformationClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}