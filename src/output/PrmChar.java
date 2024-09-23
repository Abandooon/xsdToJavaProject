package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class PrmChar {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock cond;
    
    
    
    protected DocumentationBlock remark;
    
    

    
    
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
    
    
    
    @XmlElement(name="COND")
    public DocumentationBlock getCond() {
        return this.cond;
    }

    public void setCond(DocumentationBlock value) {
        this.cond = value;
    }
    
    
    
    @XmlElement(name="REMARK")
    public DocumentationBlock getRemark() {
        return this.remark;
    }

    public void setRemark(DocumentationBlock value) {
        this.remark = value;
    }
    
    
}