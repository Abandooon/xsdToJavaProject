package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DataTypeMap {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ApplicationDataTypeRef applicationDataTypeRef;
    
    
    
    protected ImplementationDataTypeRef implementationDataTypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="APPLICATION-DATA-TYPE-REF")
    public ApplicationDataTypeRef getApplicationDataTypeRef() {
        return this.applicationDataTypeRef;
    }

    public void setApplicationDataTypeRef(ApplicationDataTypeRef value) {
        this.applicationDataTypeRef = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTATION-DATA-TYPE-REF")
    public ImplementationDataTypeRef getImplementationDataTypeRef() {
        return this.implementationDataTypeRef;
    }

    public void setImplementationDataTypeRef(ImplementationDataTypeRef value) {
        this.implementationDataTypeRef = value;
    }
    
    
}