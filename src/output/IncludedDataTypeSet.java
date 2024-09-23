package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class IncludedDataTypeSet {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DataTypeRefs dataTypeRefs;
    
    
    
    protected Identifier literalPrefix;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-TYPE-REFS")
    public DataTypeRefs getDataTypeRefs() {
        return this.dataTypeRefs;
    }

    public void setDataTypeRefs(DataTypeRefs value) {
        this.dataTypeRefs = value;
    }
    
    
    
    @XmlElement(name="LITERAL-PREFIX")
    public Identifier getLiteralPrefix() {
        return this.literalPrefix;
    }

    public void setLiteralPrefix(Identifier value) {
        this.literalPrefix = value;
    }
    
    
}