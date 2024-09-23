package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucConfigurationClassAffection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AffectedRefs affectedRefs;
    
    
    
    protected EcucAffectionEnum affectionKind;
    
    

    
    
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
    
    
    
    @XmlElement(name="AFFECTED-REFS")
    public AffectedRefs getAffectedRefs() {
        return this.affectedRefs;
    }

    public void setAffectedRefs(AffectedRefs value) {
        this.affectedRefs = value;
    }
    
    
    
    @XmlElement(name="AFFECTION-KIND")
    public EcucAffectionEnum getAffectionKind() {
        return this.affectionKind;
    }

    public void setAffectionKind(EcucAffectionEnum value) {
        this.affectionKind = value;
    }
    
    
}