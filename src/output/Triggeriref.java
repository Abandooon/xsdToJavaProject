package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Triggeriref {

    
    
    protected PTriggerInAtomicSwcTypeInstanceRef pTriggerInAtomicSwcTypeInstanceRef;
    
    

    
    
    @XmlElement(name="P-TRIGGER-IN-ATOMIC-SWC-TYPE-INSTANCE-REF")
    public PTriggerInAtomicSwcTypeInstanceRef getPTriggerInAtomicSwcTypeInstanceRef() {
        return this.pTriggerInAtomicSwcTypeInstanceRef;
    }

    public void setPTriggerInAtomicSwcTypeInstanceRef(PTriggerInAtomicSwcTypeInstanceRef value) {
        this.pTriggerInAtomicSwcTypeInstanceRef = value;
    }
    
    
}