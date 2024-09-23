package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DataPrototypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstDataPrototypeRef firstDataPrototypeRef;
    
    
    
    protected FirstToSecondDataTransformationRef firstToSecondDataTransformationRef;
    
    
    
    protected SecondDataPrototypeRef secondDataPrototypeRef;
    
    
    
    protected SubElementMappings subElementMappings;
    
    
    
    protected TextTableMappings textTableMappings;
    
    

    
    
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
    
    
    
    @XmlElement(name="FIRST-DATA-PROTOTYPE-REF")
    public FirstDataPrototypeRef getFirstDataPrototypeRef() {
        return this.firstDataPrototypeRef;
    }

    public void setFirstDataPrototypeRef(FirstDataPrototypeRef value) {
        this.firstDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="FIRST-TO-SECOND-DATA-TRANSFORMATION-REF")
    public FirstToSecondDataTransformationRef getFirstToSecondDataTransformationRef() {
        return this.firstToSecondDataTransformationRef;
    }

    public void setFirstToSecondDataTransformationRef(FirstToSecondDataTransformationRef value) {
        this.firstToSecondDataTransformationRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-DATA-PROTOTYPE-REF")
    public SecondDataPrototypeRef getSecondDataPrototypeRef() {
        return this.secondDataPrototypeRef;
    }

    public void setSecondDataPrototypeRef(SecondDataPrototypeRef value) {
        this.secondDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="SUB-ELEMENT-MAPPINGS")
    public SubElementMappings getSubElementMappings() {
        return this.subElementMappings;
    }

    public void setSubElementMappings(SubElementMappings value) {
        this.subElementMappings = value;
    }
    
    
    
    @XmlElement(name="TEXT-TABLE-MAPPINGS")
    public TextTableMappings getTextTableMappings() {
        return this.textTableMappings;
    }

    public void setTextTableMappings(TextTableMappings value) {
        this.textTableMappings = value;
    }
    
    
}