package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class IndexedArrayElement {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ApplicationArrayElementRef applicationArrayElementRef;
    
    
    
    protected ImplementationArrayElementRef implementationArrayElementRef;
    
    
    
    protected Integer index;
    
    

    
    
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
    
    
    
    @XmlElement(name="APPLICATION-ARRAY-ELEMENT-REF")
    public ApplicationArrayElementRef getApplicationArrayElementRef() {
        return this.applicationArrayElementRef;
    }

    public void setApplicationArrayElementRef(ApplicationArrayElementRef value) {
        this.applicationArrayElementRef = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTATION-ARRAY-ELEMENT-REF")
    public ImplementationArrayElementRef getImplementationArrayElementRef() {
        return this.implementationArrayElementRef;
    }

    public void setImplementationArrayElementRef(ImplementationArrayElementRef value) {
        this.implementationArrayElementRef = value;
    }
    
    
    
    @XmlElement(name="INDEX")
    public Integer getIndex() {
        return this.index;
    }

    public void setIndex(Integer value) {
        this.index = value;
    }
    
    
}