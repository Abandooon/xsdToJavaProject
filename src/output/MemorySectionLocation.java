package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class MemorySectionLocation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ProvidedMemoryRef providedMemoryRef;
    
    
    
    protected SoftwareMemorySectionRef softwareMemorySectionRef;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
        return this.s;
    }

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
        return this.t;
    }

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-MEMORY-REF")
    public ProvidedMemoryRef getProvidedMemoryRef() {
        return this.providedMemoryRef;
    }

    public void setProvidedMemoryRef(ProvidedMemoryRef value) {
        this.providedMemoryRef = value;
    }
    
    
    
    @XmlElement(name="SOFTWARE-MEMORY-SECTION-REF")
    public SoftwareMemorySectionRef getSoftwareMemorySectionRef() {
        return this.softwareMemorySectionRef;
    }

    public void setSoftwareMemorySectionRef(SoftwareMemorySectionRef value) {
        this.softwareMemorySectionRef = value;
    }
    
    
}