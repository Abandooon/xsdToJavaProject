package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ClientServerRecordTypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArgumentRef argumentRef;
    
    
    
    protected RecordElementMappings recordElementMappings;
    
    

    
    
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
    
    
    
    @XmlElement(name="ARGUMENT-REF")
    public ArgumentRef getArgumentRef() {
        return this.argumentRef;
    }

    public void setArgumentRef(ArgumentRef value) {
        this.argumentRef = value;
    }
    
    
    
    @XmlElement(name="RECORD-ELEMENT-MAPPINGS")
    public RecordElementMappings getRecordElementMappings() {
        return this.recordElementMappings;
    }

    public void setRecordElementMappings(RecordElementMappings value) {
        this.recordElementMappings = value;
    }
    
    
}