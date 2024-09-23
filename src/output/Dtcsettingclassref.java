package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dtcsettingclassref extends Ref {

    
    
    protected DiagnosticControlDtcSettingClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticControlDtcSettingClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticControlDtcSettingClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}