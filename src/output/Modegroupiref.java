package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modegroupiref {

    
    
    protected PModeGroupInAtomicSwcInstanceRef pModeGroupInAtomicSwcInstanceRef;
    
    
    
    protected RModeGroupInAtomicSwcInstanceRef rModeGroupInAtomicSwcInstanceRef;
    
    

    
    
    @XmlElement(name="P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF")
    public PModeGroupInAtomicSwcInstanceRef getPModeGroupInAtomicSwcInstanceRef() {
        return this.pModeGroupInAtomicSwcInstanceRef;
    }

    public void setPModeGroupInAtomicSwcInstanceRef(PModeGroupInAtomicSwcInstanceRef value) {
        this.pModeGroupInAtomicSwcInstanceRef = value;
    }
    
    
    
    @XmlElement(name="R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF")
    public RModeGroupInAtomicSwcInstanceRef getRModeGroupInAtomicSwcInstanceRef() {
        return this.rModeGroupInAtomicSwcInstanceRef;
    }

    public void setRModeGroupInAtomicSwcInstanceRef(RModeGroupInAtomicSwcInstanceRef value) {
        this.rModeGroupInAtomicSwcInstanceRef = value;
    }
    
    
}