package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SubElementMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstElements firstElements;
    
    
    
    protected SecondElements secondElements;
    
    
    
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
    
    
    
    @XmlElement(name="FIRST-ELEMENTS")
    public FirstElements getFirstElements() {
        return this.firstElements;
    }

    public void setFirstElements(FirstElements value) {
        this.firstElements = value;
    }
    
    
    
    @XmlElement(name="SECOND-ELEMENTS")
    public SecondElements getSecondElements() {
        return this.secondElements;
    }

    public void setSecondElements(SecondElements value) {
        this.secondElements = value;
    }
    
    
    
    @XmlElement(name="TEXT-TABLE-MAPPINGS")
    public TextTableMappings getTextTableMappings() {
        return this.textTableMappings;
    }

    public void setTextTableMappings(TextTableMappings value) {
        this.textTableMappings = value;
    }
    
    
}