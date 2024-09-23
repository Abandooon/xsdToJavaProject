package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwPointerTargetProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier targetCategory;
    
    
    
    protected SwDataDefProps swDataDefProps;
    
    
    
    protected FunctionPointerSignatureRef functionPointerSignatureRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="TARGET-CATEGORY")
    public Identifier getTargetCategory() {
        return this.targetCategory;
    }

    public void setTargetCategory(Identifier value) {
        this.targetCategory = value;
    }
    
    
    
    @XmlElement(name="SW-DATA-DEF-PROPS")
    public SwDataDefProps getSwDataDefProps() {
        return this.swDataDefProps;
    }

    public void setSwDataDefProps(SwDataDefProps value) {
        this.swDataDefProps = value;
    }
    
    
    
    @XmlElement(name="FUNCTION-POINTER-SIGNATURE-REF")
    public FunctionPointerSignatureRef getFunctionPointerSignatureRef() {
        return this.functionPointerSignatureRef;
    }

    public void setFunctionPointerSignatureRef(FunctionPointerSignatureRef value) {
        this.functionPointerSignatureRef = value;
    }
    
    
}