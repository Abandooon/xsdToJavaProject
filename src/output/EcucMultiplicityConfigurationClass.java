package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucMultiplicityConfigurationClass {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected EcucConfigurationClassEnum configClass;
    
    
    
    protected EcucConfigurationVariantEnum configVariant;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONFIG-CLASS")
    public EcucConfigurationClassEnum getConfigClass() {
        return this.configClass;
    }

    public void setConfigClass(EcucConfigurationClassEnum value) {
        this.configClass = value;
    }
    
    
    
    @XmlElement(name="CONFIG-VARIANT")
    public EcucConfigurationVariantEnum getConfigVariant() {
        return this.configVariant;
    }

    public void setConfigVariant(EcucConfigurationVariantEnum value) {
        this.configVariant = value;
    }
    
    
}