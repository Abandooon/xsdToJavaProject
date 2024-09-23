package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SenderRecRecordElementMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ApplicationRecordElementRef applicationRecordElementRef;
    
    
    
    protected ComplexTypeMapping complexTypeMapping;
    
    
    
    protected ImplementationRecordElementRef implementationRecordElementRef;
    
    
    
    protected SystemSignalRef systemSignalRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="APPLICATION-RECORD-ELEMENT-REF")
    public ApplicationRecordElementRef getApplicationRecordElementRef() {
        return this.applicationRecordElementRef;
    }

    public void setApplicationRecordElementRef(ApplicationRecordElementRef value) {
        this.applicationRecordElementRef = value;
    }
    
    
    
    @XmlElement(name="COMPLEX-TYPE-MAPPING")
    public ComplexTypeMapping getComplexTypeMapping() {
        return this.complexTypeMapping;
    }

    public void setComplexTypeMapping(ComplexTypeMapping value) {
        this.complexTypeMapping = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTATION-RECORD-ELEMENT-REF")
    public ImplementationRecordElementRef getImplementationRecordElementRef() {
        return this.implementationRecordElementRef;
    }

    public void setImplementationRecordElementRef(ImplementationRecordElementRef value) {
        this.implementationRecordElementRef = value;
    }
    
    
    
    @XmlElement(name="SYSTEM-SIGNAL-REF")
    public SystemSignalRef getSystemSignalRef() {
        return this.systemSignalRef;
    }

    public void setSystemSignalRef(SystemSignalRef value) {
        this.systemSignalRef = value;
    }
    
    
}